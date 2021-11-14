package io.github.pedroermarinho.hamburgueria.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import io.github.pedroermarinho.hamburgueria.services.validation.UsuarioInsert;

@UsuarioInsert
public class NovoUsuarioDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
	

    @NotEmpty(message="Preenchimento obrigatório")
	private String nome;

    @NotEmpty(message="Preenchimento obrigatório")
    @Email(message="Email inválido")
	private String email;   

    @NotEmpty(message="Preenchimento obrigatório")
	private String senha;

	@NotEmpty(message="Preenchimento obrigatório")
	private String telefone;
	
	public NovoUsuarioDTO( String nome, String email, String senha, String telefone) {
		super();

		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
	}

	public NovoUsuarioDTO() {
		super();
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	

	
}
