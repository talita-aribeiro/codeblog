package com.spring.codeblog.repository;

import com.spring.codeblog.model.Post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeblogRepository extends CrudRepository<Post,Long> {
}

