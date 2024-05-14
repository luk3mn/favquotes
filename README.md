![thumbnail-Desafio Java (1)](https://github.com/jacqueline-oliveira/3356-java-desafio-web/assets/66698429/a4597a93-d8de-43d8-974d-2f4e274e336c)

# Desafio


Vamos implementar uma aplicação para gerar frases aleatórias de filmes e séries, que serão consumidas por uma aplicação front-end, disponibilizada nesse [link](https://github.com/jacqueline-oliveira/3356-java-desafio-front).  

- Você precisará criar uma API REST, que disponibilize dados através do endpoint **http://localhost:8080/series/frases**;
- Será necessário criar as classes Controller, Service, Repository para implementar as requisições e busca ao banco;
- Será necessário criar a classe Model denominada **Frase** com os atributos id, titulo, frase, personagem e poster;
- Também é interessante criar a classe SerieDTO que será responsável por representar os dados que serão devolvidos para a aplicação front-end;
- Lembre-se de criar o projeto através do site do [Spring Initializr](https://start.spring.io/), onde já é possível adicionar as dependências do Sping Web, Spring Data JPA, PostgreSQL e DevTools;
- Crie o banco de dados diretamente pelo pgAdmin;
- Para ter acesso ao script para popular o banco de dados, acesse esse [link](https://gist.github.com/jacqueline-oliveira/169494892c52ca4d7cd4c6caecd799d8).
- DICA: Para fazer com que retorne a frase aleatória do banco, você pode usar uma consulta JPQL dessa forma:  **@Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")**



## 🔨 Objetivos do projeto

- O objetivo do projeto é consolidar seus conhecimentos adquiridos ao longo da formação, no que tange a Spring, Streams, JPA, aplicação Web;
- É importante iniciar o projeto do zero e ir modelando as classes, testando o acesso ao banco, verificando erros ao tentar obter dados pela aplicação front;
- Criar corretamente o controlador, mapeando a rota que a aplicação front-end irá consumir;
- Entender e corrigir erros referente a CORS;
- Promover uma experiência fullstack entendendo o fluxo da aplicação ponta a ponta.

## Script SQL
```sqlite-sql
insert into quotes(id, quote, character, title, poster) values (1, 'Amigos não mentem', 'Eleven', 'Stranger things', 'https://m.media-amazon.com/images/M/MV5BMDZkYmVhNjMtNWU4MC00MDQxLWE3MjYtZGMzZWI1ZjhlOWJmXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg');
insert into quotes(id, quote, character, title, poster) values (2, 'Bem-vinda ao mundo real. É uma droga. Você vai amar', 'Monica', 'Friends', 'https://m.media-amazon.com/images/M/MV5BNDVkYjU0MzctMWRmZi00NTkxLTgwZWEtOWVhYjZlYjllYmU4XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg');
insert into quotes(id, quote, character, title, poster) values (3, 'Não é uma mentira se você acreditar nela', 'George Contanza', 'Seinfeld', 'https://m.media-amazon.com/images/M/MV5BZjZjMzQ2ZmUtZWEyZC00NWJiLWFjM2UtMzhmYzZmZDcxMzllXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg');
insert into quotes(id, quote, character, title, poster) values (4, 'Somos apenas pessoas. Nós erramos, perdemos o rumo. Até os melhores têm os seus dias ruins. Mesmo assim seguimos em frente', 'Meredith Grey', 'Grey''s Anatomy', 'https://m.media-amazon.com/images/M/MV5BODA2Mjk0N2MtNGY0Mi00ZWFjLTkxODEtZDFjNDg4ZDliMGVmXkEyXkFqcGdeQXVyMzAzNTY3MDM@._V1_SX300.jpg');
insert into quotes(id, quote, character, title, poster) values (5, 'Eu não estou em perigo, eu sou o perigo', 'Walter White', 'Breaking Bad', 'https://m.media-amazon.com/images/M/MV5BYTU3NWI5OGMtZmZhNy00MjVmLTk1YzAtZjA3ZDA3NzcyNDUxXkEyXkFqcGdeQXVyODY5Njk4Njc@._V1_SX300.jpg');
insert into quotes(id, quote, character, title, poster) values (6, 'Não importa o que você faça na vida. Não vai ser lendário, a menos que os seus amigos estejam lá para ver', 'Barney', 'How I met your Mother', 'https://m.media-amazon.com/images/M/MV5BNjg1MDQ5MjQ2N15BMl5BanBnXkFtZTYwNjI5NjA3._V1_SX300.jpg');
insert into quotes(id, quote, character, title, poster) values (7, 'Não importa o quanto você bate, mas sim o quanto aguenta apanhar e continuar. O quanto pode suportar e seguir em frente. É assim que se ganha.', 'Rocky Balboa', 'Rocky', 'https://m.media-amazon.com/images/M/MV5BNWIyNmQyNjctYmVmMS00MGI4LWIxMmUtNjA0ODYzOTA0Yjk0L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg');
insert into quotes(id, quote, character, title, poster) values (8, 'Que a força esteja com você!', 'Obi Wan Kenobi', 'Star Wars', 'https://m.media-amazon.com/images/M/MV5BOTA5NjhiOTAtZWM0ZC00MWNhLThiMzEtZDFkOTk2OTU1ZDJkXkEyXkFqcGdeQXVyMTA4NDI1NTQx._V1_SX300.jpg');
insert into quotes(id, quote, character, title, poster) values (9, 'Você me salvou de todas as maneiras que alguém pode ser salvo.', 'Rose Dawson', 'Titanic', 'https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg');
insert into quotes(id, quote, character, title, poster) values (10, 'Você me deu uma eternidade dentro dos nossos dias numerados, e sou muito grata por isso.', 'Hazel', 'A culpa é das estrelas', 'https://m.media-amazon.com/images/M/MV5BNTVkMTFiZWItOTFkOC00YTc3LWFhYzQtZTg3NzAxZjJlNTAyXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg');
```

# Bom desafio!
