package io.github.pedroermarinho.hamburgueria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import io.github.pedroermarinho.hamburgueria.domain.Carrinho;
import io.github.pedroermarinho.hamburgueria.domain.Produto;
import io.github.pedroermarinho.hamburgueria.domain.Usuario;
import io.github.pedroermarinho.hamburgueria.domain.dto.CarrinhoDTO;
import io.github.pedroermarinho.hamburgueria.domain.dto.NovoUsuarioDTO;
import io.github.pedroermarinho.hamburgueria.domain.enums.Perfil;
import io.github.pedroermarinho.hamburgueria.exceptions.AuthorizationException;
import io.github.pedroermarinho.hamburgueria.exceptions.DataIntegrityException;
import io.github.pedroermarinho.hamburgueria.exceptions.ObjectNotFoundException;
import io.github.pedroermarinho.hamburgueria.repositories.CarrinhoRepository;
import io.github.pedroermarinho.hamburgueria.repositories.UsuarioRepository;
import io.github.pedroermarinho.hamburgueria.security.UserSS;

@Service
public class UsuarioService {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UsuarioRepository repository;

	@Autowired
	private CarrinhoRepository carrinhoRepository;

	@Autowired
	private ProdutoService produtoService;

	public Usuario find(Integer id) {

		UserSS user = UserService.authenticated();

		if (user == null || !user.hasRole(Perfil.ADMIN) && !id.equals(user.getId())) {
			throw new AuthorizationException("Acesso negado");
		}

		Optional<Usuario> obj = repository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
	}

	public Usuario insert(NovoUsuarioDTO objDTO) {

		final Usuario obj = fromObj(objDTO);
		return repository.save(obj);
	}

	public Carrinho insertCarrinho(CarrinhoDTO objDTO) {
		final Usuario usuario = find(objDTO.getUsuarioID());
		final Produto produto = produtoService.find(objDTO.getProdutoID());
		final Carrinho obj = new Carrinho(null, produto, usuario);
		return carrinhoRepository.save(obj);
	}

	public Usuario update(Usuario obj) {
		Usuario newObj = find(obj.getId());
		updateData(newObj, obj);
		return repository.save(newObj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir o Usuario");
		}
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	private void updateData(Usuario newObj, Usuario obj) {
		newObj.setNome(obj.getNome());
		newObj.setSenha(obj.getSenha());
	}

	private Usuario fromObj(NovoUsuarioDTO objDTO) {

		return new Usuario(objDTO.getNome(), objDTO.getEmail(), passwordEncoder.encode(objDTO.getSenha()),
				objDTO.getTelefone());
	}

}
