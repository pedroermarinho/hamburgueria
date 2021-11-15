package io.github.pedroermarinho.hamburgueria.domain.dto;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String descricao;
	private double preco;
	private Integer categoriaID;

	public ProdutoDTO() {
		super();
	}

	public ProdutoDTO(String nome, String descricao, double preco, Integer categoriaID) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "ProdutoDTO [categoriaID=" + categoriaID + ", descricao=" + descricao + ", id=" + id + ", nome=" + nome
				+ ", preco=" + preco + "]";
	}

}
