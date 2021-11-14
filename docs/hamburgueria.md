# Project: hamburgueria
# 📁 Collection: Produto 


## End-point: list
### Method: GET
>```
>http://localhost:8080/api/produto
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: create
### Method: POST
>```
>http://localhost:8080/api/produto
>```
### Body (**raw**)

```json
{
    "nome":"Teste",
    "descricao":"teste",
    "preco": 2.0,
    "categoriaID":1
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: delete
### Method: DELETE
>```
>http://localhost:8080/api/produto/1
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: updade
### Method: PUT
>```
>http://localhost:8080/api/produto/10
>```
### Body (**raw**)

```json
{
    "id":10,
    "nome":"Teste2",
    "categoriaID":1
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: find
### Method: GET
>```
>http://localhost:8080/api/produto/1
>```

⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: categoriaList
### Method: GET
>```
>http://localhost:8080/api/produto/categoria/2
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: nomelist
### Method: GET
>```
>http://localhost:8080/api/produto/nome/Suco de uva
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Usuario 


## End-point: list
### Method: GET
>```
>http://localhost:8080/api/usuario/all
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: create
### Method: POST
>```
>http://localhost:8080/api/usuario
>```
### Body (**raw**)

```json
{
    "nome":"teste",
    "email":"teste@gmail.com",
    "telefone": "99 999999999",
    "senha":"123"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: delete
### Method: DELETE
>```
>http://localhost:8080/api/usuario/16
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: updade
### Method: PUT
>```
>http://localhost:8080/api/usuario/15
>```
### Body (**raw**)

```json
{
    "id":15,
    "nome":"teste2",
    "senha":"123"
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: find
### Method: GET
>```
>http://localhost:8080/api/usuario/1
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: current
### Method: GET
>```
>http://localhost:8080/api/usuario
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM3MDExMDM4fQ.thg3Oo-A7zFJIlHQhh8wvXsaaFTcfNjWvnxXJV-mMwnP3hgGppx9yDa-CqjbHGS8mi7sOAhcuIQPtoYYrnL4Fw|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: carrinho
### Method: POST
>```
>http://localhost:8080/api/usuario/carrinho
>```
### Body (**raw**)

```json
{
    "produtoID":1,
    "usuarioID":2
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Categoria 


## End-point: list
### Method: GET
>```
>http://localhost:8080/api/categoria
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: create
### Method: POST
>```
>http://localhost:8080/api/categoria
>```
### Body (**raw**)

```json
{

    "nome": "teste"
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: delete
### Method: DELETE
>```
>http://localhost:8080/api/categoria/3
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: updade
### Method: PUT
>```
>http://localhost:8080/api/categoria/1
>```
### Body (**raw**)

```json
{
    "id": 1,
    "nome": "Teste"
},
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: find
### Method: GET
>```
>http://localhost:8080/api/categoria/1
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1AZ21haWwuY29tIiwiZXhwIjoxNjM2OTIzMjY1fQ.I3QEp24LdvvOxqCAna7X1LE9CAnqHM1YOW6WYcj5pzGiB3S4J9g1OoMpzpB_k2UNFLoNdUDZshUNxzq-PYdbYQ|string|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: login 


## End-point: login
### Method: POST
>```
>http://localhost:8080/login
>```
### Body (**raw**)

```json
{
    "email":"adm@gmail.com",
    "senha":"123"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
_________________________________________________
Powered By: [postman-to-markdown](https://github.com/bautistaj/postman-to-markdown/)
