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
            
          
         Produto produto1 = new Produto(null, "Suco de laranja","....",2.0, ctg2);
         Produto produto2 = new Produto(null, "Suco de uva","....",2.5, ctg2);
         Produto produto3 = new Produto(null, "Suco de uva","....",2.2, ctg2);
         Produto produto4 = new Produto(null, "Suco de uva", "....",2.2,ctg2);
         Produto produto5 = new Produto(null, "Suco de manga", "....",4.2,ctg2);
         Produto produto6 = new Produto(null, "Suco de morango","....",2.2, ctg2);
         Produto produto7 = new Produto(null, "Suco de melancia","....",2.2, ctg2);
         Produto produto8 = new Produto(null, "Suco de acerola", "....",5.2,ctg2);
         Produto produto9 = new Produto(null, "Suco de graviola","....",2.2, ctg2);

         Produto produto10 = new Produto(null, "Sanduíches de queijos","....",20.2, ctg1);
         Produto produto11 = new Produto(null, "Sanduíche de queijo e ovo","....",21.2, ctg1);
         Produto produto12 = new Produto(null, "Sanduíche de queijo minas", "....",22.2,ctg1);
         Produto produto13 = new Produto(null, "Sanduíche de forno","....",23.2, ctg1);
         Produto produto14 = new Produto(null, "Sanduíche de mortadela e queijo", "....",2.2,ctg1);
         Produto produto15 = new Produto(null, "Sanduíche vegetariano","....",24.2, ctg1);
         Produto produto16 = new Produto(null, "Sanduíche salada de ovo","....",25.2, ctg1);
         Produto produto17 = new Produto(null, "Sanduíche mexicano", "....",26.2,ctg1);
         Produto produto18 = new Produto(null, "Sanduíche de frango", "....",27.2,ctg1);




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


        Carrinho carrinh1 = new Carrinho(null, produto1, user1);
        Carrinho carrinh2 = new Carrinho(null, produto2, user2);
        Carrinho carrinh3 = new Carrinho(null, produto1, user2);
        Carrinho carrinh4 = new Carrinho(null, produto4, user3);
        Carrinho carrinh5 = new Carrinho(null, produto5, user4);
        Carrinho carrinh6 = new Carrinho(null, produto6, user5);
        Carrinho carrinh7 = new Carrinho(null, produto7, user6);
        Carrinho carrinh8 = new Carrinho(null, produto8, user7);
        Carrinho carrinh9 = new Carrinho(null, produto9, user8);
        Carrinho carrinh10 = new Carrinho(null, produto10, user9);


        user1.setCarrinho(carrinh1);
        user2.setCarrinho(carrinh2);
        user2.setCarrinho(carrinh3);
        user3.setCarrinho(carrinh4);
        user4.setCarrinho(carrinh5);
        user5.setCarrinho(carrinh6);
        user6.setCarrinho(carrinh7);
        user7.setCarrinho(carrinh8);
        user8.setCarrinho(carrinh9);
        user9.setCarrinho(carrinh10);
        

     





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

        carrinhoRepository.saveAll(Arrays.asList(carrinh1,carrinh2,carrinh3,carrinh4,carrinh5,carrinh6,carrinh7,carrinh8,carrinh9,carrinh10));

    }
}
