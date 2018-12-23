## Micro Service usando Spring Data Rest e Oracle.

### Requisitos.

- Java 8
- Eclipse
- Oracle/Oracle XE

### Executando a aplicação.


Após criar os objetos no banco de dados podemos executar a nossa aplicação com o Tomcat Embedded, e então vamos ter os métodos https abaixo.


Salvar um novo Registro.

POST

http://localhost:8090/funcionarios

request
```javascript
{

    "nome": "cicero 1",
    "salario": 1
}
```


Alterar um Registro.

PUT

http://localhost:8090/funcionarios/5

request
```javascript
{
    
    "nome": "cicero 111",
    "salario": 1
}
```

Consultar todos os registros.

GET

http://localhost:8090/funcionarios

response
```javascript
{
   "_embedded": {"funcionarios":    [
            {
         "codigo": "1",
         "nome": "cicero",
         "salario": 1,
         "_links":          {
            "self": {"href": "http://localhost:8090/funcionarios/1"},
            "funcionarioEntity":             {
               "href": "http://localhost:8090/funcionarios/1{?projection}",
               "templated": true
            }
         }
      },
            {
         "codigo": "2",
         "nome": "cicero",
         "salario": 1,
         "_links":          {
            "self": {"href": "http://localhost:8090/funcionarios/2"},
            "funcionarioEntity":             {
               "href": "http://localhost:8090/funcionarios/2{?projection}",
               "templated": true
            }
         }
      },
            {
         "codigo": "3",
         "nome": "cicero",
         "salario": 1,
         "_links":          {
            "self": {"href": "http://localhost:8090/funcionarios/3"},
            "funcionarioEntity":             {
               "href": "http://localhost:8090/funcionarios/3{?projection}",
               "templated": true
            }
         }
      },
            {
         "codigo": "-45",
         "nome": "cicero",
         "salario": 1,
         "_links":          {
            "self": {"href": "http://localhost:8090/funcionarios/-45"},
            "funcionarioEntity":             {
               "href": "http://localhost:8090/funcionarios/-45{?projection}",
               "templated": true
            }
         }
      },
            {
         "codigo": "-44",
         "nome": "cicero",
         "salario": 1,
         "_links":          {
            "self": {"href": "http://localhost:8090/funcionarios/-44"},
            "funcionarioEntity":             {
               "href": "http://localhost:8090/funcionarios/-44{?projection}",
               "templated": true
            }
         }
      },
            {
         "codigo": "-43",
         "nome": "cicero",
         "salario": 1,
         "_links":          {
            "self": {"href": "http://localhost:8090/funcionarios/-43"},
            "funcionarioEntity":             {
               "href": "http://localhost:8090/funcionarios/-43{?projection}",
               "templated": true
            }
         }
      },
            {
         "codigo": "5",
         "nome": "cicero 111",
         "salario": 1,
         "_links":          {
            "self": {"href": "http://localhost:8090/funcionarios/5"},
            "funcionarioEntity":             {
               "href": "http://localhost:8090/funcionarios/5{?projection}",
               "templated": true
            }
         }
      },
            {
         "codigo": "6",
         "nome": "cicero 1",
         "salario": 1,
         "_links":          {
            "self": {"href": "http://localhost:8090/funcionarios/6"},
            "funcionarioEntity":             {
               "href": "http://localhost:8090/funcionarios/6{?projection}",
               "templated": true
            }
         }
      }
   ]},
   "_links":    {
      "self":       {
         "href": "http://localhost:8090/funcionarios{?page,size,sort,projection}",
         "templated": true
      },
      "profile": {"href": "http://localhost:8090/profile/funcionarios"},
      "search": {"href": "http://localhost:8090/funcionarios/search"}
   },
   "page":    {
      "size": 20,
      "totalElements": 8,
      "totalPages": 1,
      "number": 0
   }
}
```


consultar um registro pela sua chave.

GET

http://localhost:8090/funcionarios/6

response
```javascript
{
   "nome": "cicero 1",
   "salario": 1,
   "_links":    {
      "self": {"href": "http://localhost:8090/funcionarios/6"},
      "funcionarioEntity":       {
         "href": "http://localhost:8090/funcionarios/6{?projection}",
         "templated": true
      }
   }
}
```

Excluir um registro pela chave.

GET

http://localhost:8090/funcionarios/5




Consulta parametrizada criada na interface FuncionarioRepository.

GET

http://localhost:8090/funcionarios/search/findByNome?nome=maria

response
```javascript
{
  "_embedded" : {
    "funcionarios" : [ {
      "codigo" : "7",
      "nome" : "maria",
      "salario" : 1.0,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8090/funcionarios/7"
        },
        "funcionarioEntity" : {
          "href" : "http://localhost:8090/funcionarios/7{?projection}",
          "templated" : true
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8090/funcionarios/search/findByNome?nome=maria"
    }
  }
}
```




Hal Browse - torna a api mais explorável para os usuários.

http://localhost:8090/browser/index.html#/



