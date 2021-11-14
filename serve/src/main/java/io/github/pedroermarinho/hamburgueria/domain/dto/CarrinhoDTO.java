package io.github.pedroermarinho.hamburgueria.domain.dto;

import java.io.Serializable;

public class CarrinhoDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Integer produtoID;
    private Integer usuarioID;

    public CarrinhoDTO(Integer produtoID, Integer usuarioID) {
        this.produtoID = produtoID;
        this.usuarioID = usuarioID;
    }
    public CarrinhoDTO() {
    }
    public Integer getProdutoID() {
        return produtoID;
    }
    public void setProdutoID(Integer produtoID) {
        this.produtoID = produtoID;
    }
    public Integer getUsuarioID() {
        return usuarioID;
    }
    public void setUsuarioID(Integer usuarioID) {
        this.usuarioID = usuarioID;
    }

    
    
    
}
