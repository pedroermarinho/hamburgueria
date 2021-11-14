package io.github.pedroermarinho.hamburgueria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import io.github.pedroermarinho.hamburgueria.domain.Produto;
import io.github.pedroermarinho.hamburgueria.domain.Categoria;
import io.github.pedroermarinho.hamburgueria.domain.dto.ProdutoDTO;
import io.github.pedroermarinho.hamburgueria.exceptions.DataIntegrityException;
import io.github.pedroermarinho.hamburgueria.exceptions.ObjectNotFoundException;
import io.github.pedroermarinho.hamburgueria.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	
	@Autowired
	ProdutoRepository repository;
	
	@Autowired
	private CategoriaService categoriaService;
	
	
	public Produto find(Integer id) {
		Optional<Produto> obj = repository.findById(id);
		
		return  obj.orElseThrow(() -> new ObjectNotFoundException(
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName()));
	}

	
	public Produto insert(ProdutoDTO objDTO) {
		objDTO.setId(null);
		final Produto obj = fromObj(objDTO);
		return repository.save(obj);
	}
	
	public Produto update(ProdutoDTO objDTO) {
		Produto newObj = find(objDTO.getId());
		updateData(newObj, fromObj(objDTO));
		return repository.save(newObj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repository.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir o Produto");
		}
	}
	
	public List<Produto> findAll() {
		return repository.findAll();
	}
	
	public List<Produto> findByCategoria(int categoriaID) {
		final Categoria obj = categoriaService.find(categoriaID);
		return repository.findByCategoria(obj);
	}

	public List<Produto> findByNome(String nome) {
		return repository.findByNome(nome);
	}
	
	private void updateData(Produto newObj, Produto obj) {
		newObj.setNome(obj.getNome());
		newObj.setCategoria(obj.getCategoria());
		
	}
	
	private Produto fromObj(ProdutoDTO objDTO) {
		
		final Categoria categoria = categoriaService.find(objDTO.getCategoriaID());
		
		
		return new Produto(objDTO.getId(), objDTO.getNome(),categoria);
		
		
	}

}
