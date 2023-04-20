package com.marcinator.sqlbinder.repositories;

import com.marcinator.sqlbinder.models.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}