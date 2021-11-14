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
import io.github.pedroermarinho.hamburgueria.domain.Produto;
import io.github.pedroermarinho.hamburgueria.domain.dto.ProdutoDTO;
import io.github.pedroermarinho.hamburgueria.services.ProdutoService;

@RestController
@RequestMapping(value = Constants.API_URL_PRODUTO)
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Produto> find(@PathVariable Integer id) {
		Produto obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody ProdutoDTO objDTO) {
		var obj = service.insert(objDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody ProdutoDTO objDTO, @PathVariable Integer id) {
		objDTO.setId(id);
		 service.update(objDTO);
		return ResponseEntity.noContent().build();
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@RequestMapping(value="/categoria/{id}", method=RequestMethod.GET)
	public ResponseEntity<List<Produto>> findByCategoria(@PathVariable Integer id) {
		List<Produto> list = service.findByCategoria(id);
		return ResponseEntity.ok().body(list);
	}

	@RequestMapping(value="/nome/{nome}", method=RequestMethod.GET)
	public ResponseEntity<List<Produto>> findByNome(@PathVariable String nome) {
		List<Produto> list = service.findByNome(nome);
		return ResponseEntity.ok().body(list);
	}

}
