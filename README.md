# ShiiApi


## Description

ShiiApi é um projeto pessoal simples que atualmente esta sendo consumido pelo projeto [ShiiFront](https://github.com/MateusSantoSB/ShiiFront). Esta Api tem como objetivo salvar e retornar "segredos" salvos pelos usuarios de forma totalmente anônima.

Este projeto foi desenvolvido inteiramente utilizando a liguagem java eo framework Spring boot.
A api esta online em [ShiiApi](https://shiithesecret-api.onrender.com) com limitações no primeiro request de aproximadamente 1min, pois utilizo a versão gratuita do render.com,onde esta salvo o banco de dados que esta sendo utilizado pela api.


##
ShiiApi is a simple personal project currently being consumed by the [ShiiFront](https://github.com/MateusSantoSB/ShiiFront) project. This API aims to save and retrieve "secrets" stored by users in a completely anonymous way.

This project was entirely developed using the Java programming language and the Spring Boot framework.
The API is online at [ShiiApi](https://shiithesecret-api.onrender.com) with limitations on the first request of approximately 1 minute, as I am using the free version of render.com, where the database used by the API is hosted.

##  Technologies
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)


![Postgres](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)

![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

## Test
### Instalação

Certifique-se de ter o Jdk 21 eo Maven instalado em sua maquina.

Em ```src/main/resources/templates/sql.sql```  temos o padrão sql para gerar o banco de dados.

Se prefirir temos na ```/``` o ```Dockerfile``` para rodar em ambiente docker.



### Pare rodar use na pasta raiz do projeto:

```mvn clean install``` 

```java -jar target/ShiiTS-0.0.1.jar```

### O projeto ira rodar na porta ```8080```


##

### Installation

Make sure you have Jdk 21 and Maven installed on your machine.

### To run use in the project root folder:

```mvn clean install``` 

```java -jar target/ShiiTS-0.0.1.jar```

### The project will run on localhost ```8080```

## End Points


### ``` Get``` 
### /shii/secrets
Para buscar um segredo.

```
{
    "secret":"hellow word",
    "username":"java"

}
```
### ``` Post``` 
### /shii/secrets
Para salvar um segredo.
```
{
    "secret":"hellow word",
    "username":"new java"

}
```
