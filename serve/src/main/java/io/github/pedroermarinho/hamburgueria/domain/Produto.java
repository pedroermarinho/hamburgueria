package io.github.pedroermarinho.hamburgueria.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Produto  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id;

	private String nome;
	private String descricao;
	private double preco;
	
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria; 

	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Carrinho> carrinho = new ArrayList<>();
	
	

	public Produto(Integer id, String nome,String descricao,double preco, Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.descricao =descricao;
		this.preco= preco;
	}

	public Produto() {
		super();
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Produto [carrinho=" + carrinho + ", categoria=" + categoria + ", descricao=" + descricao + ", id=" + id
				+ ", nome=" + nome + ", preco=" + preco + "]";
	}

	
	
}
