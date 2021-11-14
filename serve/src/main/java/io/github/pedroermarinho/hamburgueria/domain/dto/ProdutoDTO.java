package io.github.pedroermarinho.hamburgueria.domain.dto;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Integer categoriaID; 

	
	public ProdutoDTO() {
		super();
	}


	public ProdutoDTO(Integer id, String nome, Integer categoriaID) {
		this.id = id;
		this.nome = nome;
		this.categoriaID = categoriaID;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getCategoriaID() {
		return categoriaID;
	}


	public void setCategoriaID(Integer categoriaID) {
		this.categoriaID = categoriaID;
	}
	
	
	
	
	
	

}
