import {http} from '../model/http';
import {URL_API} from './constantes';

export default async function(form){
    await http.post(URL_API+"api/produto",{
        "nome":form.nome,
        "descricao":form.descricao,
        "preco":form.preco,
        "categoriaID":form.categoriaID,
      });
}
