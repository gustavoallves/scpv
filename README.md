# Sistema de Controle de Produção e Vendas (SCPV)

## 📖 Sobre o Projeto
Este projeto é uma API RESTful para um Sistema de Controle de Produção e Vendas (SCPV), desenvolvido como uma solução de software para uma peixaria fictícia. O desenvolvimento foi guiado por um documento de caso de uso real e diagramas da disciplina de Modelagem de Sistemas UML, com o objetivo de traduzir um design formal em uma aplicação funcional e robusta utilizando as melhores práticas do ecossistema Spring.

O sistema permite o gerenciamento de entidades essenciais como Espécies de pescado e Embarcações, incluindo um modelo de dados complexo que suporta diferentes tipos de embarcações (próprias e de terceiros) através de herança.

<img src="https://github.com/user-attachments/assets/5201f29f-7856-4ecf-a6a6-4de1497832ef" width=400/>

## ✨ Funcionalidades Principais
• Gerenciamento de Espécies: Operações CRUD (Create, Read, Update, Delete) completas para as espécies de pescado.
• Gerenciamento de Embarcações: CRUD completo para embarcações.
• Modelo de Herança: Suporte para múltiplos tipos de embarcações (Próprias e de Terceiros) utilizando a estratégia SINGLE_TABLE do JPA/Hibernate.
• Validação de Dados: Validações robustas na entrada de dados usando a Bean Validation API.
• Tratamento de Exceções: ControllerAdvice global para um tratamento de erros padronizado e respostas de erro claras.
• Arquitetura em Camadas: Código organizado seguindo os princípios de Controller, Service e Repository.
• Padrão DTO e Mapeamento: Uso do padrão DTO (Data Transfer Object) e da biblioteca MapStruct para um fluxo de dados seguro e desacoplado entre as camadas.

## 🛠️ Tecnologias Utilizadas
Abaixo estão as principais tecnologias e ferramentas utilizadas no desenvolvimento do SCPV:

Backend: Java 21, Spring Boot
Persistência de Dados: Spring Data JPA, Hibernate
Banco de Dados: MySQL
Containerização: Docker, Docker Compose
Build & Dependências: Maven
Utilitários: MapStruct

## 🏛️ Arquitetura e Decisões de Design
O projeto foi construído seguindo uma arquitetura em camadas bem definida para garantir a separação de responsabilidades, manutenibilidade e testabilidade do código.
• Conventional Commits: O histórico de commits segue o padrão Conventional Commits, o que torna o histórico legível e facilita a automação de versionamento.
• DTO Pattern: Foram utilizados DTOs específicos para requisições (Request) e respostas (Response), garantindo que a API não exponha detalhes internos das entidades do banco de dados e permitindo a criação de "contratos" de API mais flexíveis.
• Herança com JPA: A decisão de usar a estratégia InheritanceType.SINGLE_TABLE para a entidade Vessel foi tomada para otimizar as consultas, evitando a necessidade de JOINs complexos para buscar diferentes tipos de embarcações.

<img src="https://github.com/user-attachments/assets/a64dc51e-b80e-4303-b4a3-7c9f81e6a60d" width=400/>
