package io.github.pedroermarinho.hamburgueria.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.github.pedroermarinho.hamburgueria.config.Constants;
import io.github.pedroermarinho.hamburgueria.domain.Usuario;
import io.github.pedroermarinho.hamburgueria.domain.dto.CarrinhoDTO;
import io.github.pedroermarinho.hamburgueria.domain.dto.NovoUsuarioDTO;
import io.github.pedroermarinho.hamburgueria.services.UsuarioService;
import io.github.pedroermarinho.hamburgueria.services.UserService;

@RestController
@RequestMapping(value = Constants.API_URL_USUARIO)
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;


	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Usuario> find(@PathVariable Integer id) {
		Usuario obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Usuario> current() {
		Usuario obj = service.find(UserService.authenticated().getId());
		return ResponseEntity.ok().body(obj);
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody NovoUsuarioDTO newObj) {
		System.out.println(newObj);
		var obj = service.insert(newObj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Usuario obj, @PathVariable Integer id) {
		obj.setId(id);
		service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@RequestMapping(value = "/carrinho", method=RequestMethod.POST)
	public ResponseEntity<Void> insertCarrinho(@RequestBody CarrinhoDTO newObj) {
		var obj = service.insertCarrinho(newObj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}



	
	
}
