package io.github.pedroermarinho.hamburgueria.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import io.github.pedroermarinho.hamburgueria.domain.Usuario;
import io.github.pedroermarinho.hamburgueria.domain.dto.NovoUsuarioDTO;
import io.github.pedroermarinho.hamburgueria.exceptions.FieldMessage;
import io.github.pedroermarinho.hamburgueria.repositories.UsuarioRepository;

public class UsuarioInsertValidator implements ConstraintValidator<UsuarioInsert, NovoUsuarioDTO> {

    
    @Autowired
	private UsuarioRepository repository;

    @Override
	public void initialize(UsuarioInsert ann) {
	}


    @Override
    public boolean isValid(NovoUsuarioDTO value, ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();



        Usuario aux =repository.findByEmail(value.getEmail());
		if (aux != null) {
			list.add(new FieldMessage("email", "Email já existente"));
		}
        return false;
    }
}
