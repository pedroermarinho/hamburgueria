package io.github.pedroermarinho.hamburgueria.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import io.github.pedroermarinho.hamburgueria.domain.Produto;
import io.github.pedroermarinho.hamburgueria.domain.Carrinho;
import io.github.pedroermarinho.hamburgueria.domain.Categoria;
import io.github.pedroermarinho.hamburgueria.domain.Usuario;

import io.github.pedroermarinho.hamburgueria.domain.enums.Perfil;
import io.github.pedroermarinho.hamburgueria.repositories.ProdutoRepository;
import io.github.pedroermarinho.hamburgueria.repositories.CarrinhoRepository;
import io.github.pedroermarinho.hamburgueria.repositories.CategoriaRepository;
import io.github.pedroermarinho.hamburgueria.repositories.UsuarioRepository;

@Service
public class DBService {

    @Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
    

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;


    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CarrinhoRepository carrinhoRepository;


    public void instantiateTestDataBase(){
        

      



        
        Categoria ctg1 = new Categoria(null, "Comida");
        Categoria ctg2 = new Categoria(null, "Bebida");

        categoriaRepository.saveAll(Arrays.asList(ctg1,ctg2));

         Produto produto1 = new Produto(null, "Suco de laranja", ctg2);
         Produto produto2 = new Produto(null, "Suco de uva", ctg2);
         Produto produto3 = new Produto(null, "Suco de uva", ctg2);
         Produto produto4 = new Produto(null, "Suco de uva", ctg2);
         Produto produto5 = new Produto(null, "Suco de manga", ctg2);
         Produto produto6 = new Produto(null, "Suco de morango", ctg2);
         Produto produto7 = new Produto(null, "Suco de melancia", ctg2);
         Produto produto8 = new Produto(null, "Suco de acerola", ctg2);
         Produto produto9 = new Produto(null, "Suco de graviola", ctg2);

         Produto produto10 = new Produto(null, "Sanduíches de queijos", ctg1);
         Produto produto11 = new Produto(null, "Sanduíche de queijo e ovo", ctg1);
         Produto produto12 = new Produto(null, "Sanduíche de queijo minas", ctg1);
         Produto produto13 = new Produto(null, "Sanduíche de forno", ctg1);
         Produto produto14 = new Produto(null, "Sanduíche de mortadela e queijo", ctg1);
         Produto produto15 = new Produto(null, "Sanduíche vegetariano", ctg1);
         Produto produto16 = new Produto(null, "Sanduíche salada de ovo", ctg1);
         Produto produto17 = new Produto(null, "Sanduíche mexicano", ctg1);
         Produto produto18 = new Produto(null, "Sanduíche de frango", ctg1);




        produtoRepository.saveAll(Arrays.asList(produto1,produto2,produto3,produto4,produto5,produto6,produto7,produto8,produto9
        ,produto10,produto11,produto12,produto13,produto14,produto15,produto16,produto17,produto18));

    

        Usuario user1 = new Usuario("Pedro Marinho", "pedro.marinho238@gmail.com", bCryptPasswordEncoder.encode("123") ,"99 999999999");

        Usuario user2 = new Usuario("adm", "adm@gmail.com", bCryptPasswordEncoder.encode("123"),  "99 999999998");

        Usuario user3 = new Usuario("João", "joão@gmail.com", bCryptPasswordEncoder.encode("123") , "99 999999999");
    

        Usuario user4 = new Usuario("Ruam", "Ruam@gmail.com", bCryptPasswordEncoder.encode("123") ,  "99 999999999");
        
        Usuario user5 = new Usuario("ronaldo", "ronaldo@gmail.com", bCryptPasswordEncoder.encode("123") ,  "99 999999999");
        
        Usuario user6 = new Usuario("maria", "maria@gmail.com", bCryptPasswordEncoder.encode("123") , "99 999999999");
        
        Usuario user7 = new Usuario("fernanda", "fernanda@gmail.com", bCryptPasswordEncoder.encode("123") ,"99 999999999");
        
        Usuario user8 = new Usuario("rikelme", "rikelme@gmail.com", bCryptPasswordEncoder.encode("123") , "99 999999999");
        
        Usuario user9 = new Usuario("Victor", "victor@gmail.com", bCryptPasswordEncoder.encode("123") ,  "99 999999999");
        
        Usuario user10 = new Usuario("marcos", "marcos@gmail.com", bCryptPasswordEncoder.encode("123") ,"99 999999999");

        Usuario user11 = new Usuario("Júnior", "junior@gmail.com", bCryptPasswordEncoder.encode("123") ,  "99 999999999");

        Usuario user12 = new Usuario("Mateus", "mateus@gmail.com", bCryptPasswordEncoder.encode("123") , "99 999999999");

        Usuario user13 = new Usuario("Felipe", "felipe@gmail.com", bCryptPasswordEncoder.encode("123") ,  "99 999999999");

        Usuario user14 = new Usuario("Marcelo", "macelo@gmail.com", bCryptPasswordEncoder.encode("123") , "99 999999999");

        Usuario user15 = new Usuario("Janielson", "janielson.com", bCryptPasswordEncoder.encode("123") ,  "99 999999999");

         user2.addPerfil(Perfil.ADMIN);


        Carrinho carrinho = new Carrinho(null, produto1, user1);
        user1.setCarrinho(carrinho);

     





        usuarioRepository.saveAll(Arrays.asList(
        user1,
        user2,
        user3,
        user4,
        user5,
        user6,
        user7,
        user8,
        user9,
        user10,
        user11,
        user12,
        user13,
        user14,
        user15
        ));

        carrinhoRepository.saveAll(Arrays.asList(carrinho));

    }
}
