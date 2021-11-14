package io.github.pedroermarinho.hamburgueria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.pedroermarinho.hamburgueria.domain.Categoria;
import io.github.pedroermarinho.hamburgueria.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    List<Produto> findByCategoria(Categoria categoria);
    List<Produto> findByNome(String nome);;
}
