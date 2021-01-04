package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){
        List<Post> postList=new ArrayList<>();
        Post post1=new Post();


        post1.setAutor("Talita");
        post1.setData(LocalDate.now());
        post1.setTitulo("Meu primeiro post");
        post1.setTexto("Atualmente, trabalho como freelancer. Realizo todas as etapas para o cliente ter um site moderno, de qualidade e com preço acessível. Procuro o equilíbrio entre o que cliente deseja e a minha experiência com o que os usuários gostam, pois não basta ter apenas um site bonito, é preciso ter resultados. Também trabalho em parceria com empresas para criação e manutenção de sites.");

        Post post2=new Post();
        post2.setAutor("Talita");
        post2.setData(LocalDate.now());
        post2.setTitulo("Meu segundo post");
        post2.setTexto("Atualmente, trabalho como freelancer. Realizo todas as etapas para o cliente ter um site moderno, de qualidade e com preço acessível. Procuro o equilíbrio entre o que cliente deseja e a minha experiência com o que os usuários gostam, pois não basta ter apenas um site bonito, é preciso ter resultados. Também trabalho em parceria com empresas para criação e manutenção de sites.");

        postList.add(post1);
        postList.add(post2);

        for (Post post:postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println("O id do post e:"+ postSaved.getId());
        }


    }
}
