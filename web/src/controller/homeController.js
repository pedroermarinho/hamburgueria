import { http } from '../model/http';
import {URL_API} from './constantes';
import store from './store';

const getProdutos= async  function(){

    const response = await http.get(URL_API+"api/produto");

    const data = response.data;

    console.log("getProdutos"+ data);

    return data;
};

const getProdutosCategoria= async  function(id){

    const response = await http.get(URL_API+"api/produto/categoria/"+id);

    const data = response.data;

    console.log("getProdutosCategoria"+ data);

    return data;
};

const getProdutosNome= async  function(nome){

    const response = await http.get(URL_API+"api/produto/nome/"+nome);

    const data = response.data;

    console.log( data);

    return data;
};

const addCarrinho= async  function(idProduto){

    const response = await http.post(URL_API+"api/usuario/carrinho/",{
        "produtoID":idProduto,
        "usuarioID":store.state.user.id,
    });

    const data = response.data;

    console.log( data);

    return data;
};

const getCarrinho= async  function(){

    const response = await http.get(URL_API+"api/usuario/",);

    const data = response.data.carrinho;

    console.log( data);

    return data;
};


export {getProdutos,getProdutosCategoria,getProdutosNome,addCarrinho,getCarrinho};