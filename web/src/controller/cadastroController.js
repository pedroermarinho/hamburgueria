import {http} from '../model/http';
import {URL_API} from './constantes';

export default async function(form){
    await http.post(URL_API+"api/usuario",{
        "nome":form.nome,
        "email":form.email,
        "senha":form.senha,
        "telefone":form.telefone,
      });
}

