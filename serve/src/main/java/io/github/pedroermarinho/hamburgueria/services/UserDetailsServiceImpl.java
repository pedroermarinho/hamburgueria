package io.github.pedroermarinho.hamburgueria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.github.pedroermarinho.hamburgueria.domain.Usuario;
import io.github.pedroermarinho.hamburgueria.repositories.UsuarioRepository;
import io.github.pedroermarinho.hamburgueria.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
         final Usuario usuario = usuarioRepository.findByEmail(email);

        

         if (usuario == null) {
             throw new UsernameNotFoundException(email);
         }
        return new  UserSS(usuario.getId(), usuario.getEmail(), usuario.getSenha(), usuario.getPerfis());
    }


    
}
