# 📅 EVENTOS_BD

Sistema backend para gerenciamento de eventos, desenvolvido com **Spring Boot** e **JPA (Hibernate)**. Permite o cadastro, controle e associação entre pessoas, empresas, eventos e suas participações.

## 🚀 Tecnologias Utilizadas
- Java 21
- Spring Boot
- Spring JPA (Hibernate)
- PostgreSQL (ou qualquer banco relacional)
- Maven

## ⚙️ Pré-requisitos

Para rodar o projeto localmente, você precisa ter:

- Java 21+
- IDE de sua preferência (Eclipse, IntelliJ, VSCode)
- Banco de dados PostgreSQL (ou outro banco relacional)
- Maven

## 🔧 Configuração do Banco de Dados

O arquivo de configuração está localizado em:
```
src/main/resources/application.properties
```

No caso de uso com outro banco relacional (como MySQL), será necessário:

1. Alterar as configurações de conexão no `application.properties`.
2. Adicionar o driver correspondente no `pom.xml`.

## 🗂️ Estrutura do Projeto
```
src
└── main
└── java
└── com.bd.eventos
├── commons
├── controllers 
├── entities
├── repositories
├── services
└── EventosApplication
```

### 📌 Camadas do Projeto

#### ✅ Entidades (`entities`)
Representações das tabelas do banco. Utiliza anotações JPA para definição das relações:
- `@ManyToOne`: muitos para um
- `@ManyToMany`: muitos para muitos

#### ✅ Repositórios (`repositories`)
Responsáveis pela comunicação com o banco de dados. Estendem `JpaRepository` para acesso a métodos de CRUD.

#### ✅ Serviços (`services`)
Contêm a lógica de negócio da aplicação. Cada entidade possui um serviço com os métodos básicos de criação, leitura, atualização e deleção (CRUD).

#### ✅ Controladores (`controllers`)
Exposição dos serviços via endpoints REST, com métodos HTTP como:
- `GET`, `POST`, `PUT`, `DELETE`

## ▶️ Como Rodar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/eventos_bd.git
```
2. Navegue até a pasta do projeto:
```
cd eventos_bd
```
3. Configure o application.properties com os dados do seu banco.

4. Rode o projeto a partir da sua IDE. 

---

### 📝 Observações
Este projeto é compatível com qualquer banco de dados relacional.

> Caso utilize outro banco que não seja PostgreSQL, lembre-se de adicionar a dependência do driver no pom.xml correspondente ao seu banco.