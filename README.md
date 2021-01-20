## 💻 CodeBlog

Projeto de blog pessoal inspirado no curso da Michelli Brito [link](https://www.youtube.com/watch?v=UdJYuwnqL3I&list=PL8iIphQOyG-AdKMQWtt1bqdVm8QUnX7_Shttp:// "link")

### Bônus

- Delete de Post
- Docker

### Exemplo

#### Requisitos
- Docker
- Docker Compose
- Database no Postgress

#### Como rodar
Crie um arquivo *.env* a partir do arquivo *.env-sample*.
Exemplo:

    ADMIN_USER=usuario-com-permissao-post
    ADMIN_PASSWORD=senha-do-usuario
    DB_DATABASE=database-exemplo
    DB_USER=usuario-db
    DB_PASSWORD=senha-db

Execute o comando:
```shell
docker-compose up
```
### 🛠️ Construído com

* [Spring Boot](https://spring.io/projects/spring-boot)
* [Maven](https://maven.apache.org/)
* [Thymeleaf](https://www.thymeleaf.org/)
* [Postgres](https://www.postgresql.org/)
