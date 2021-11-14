package io.github.pedroermarinho.hamburgueria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.pedroermarinho.hamburgueria.domain.Carrinho;
import io.github.pedroermarinho.hamburgueria.domain.Categoria;

@Repository
public interface CarrinhoRepository  extends JpaRepository<Carrinho, Integer>{

}
