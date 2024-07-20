package com.example.article.article;


import java.util.List;

public interface IArticleService {
    ArticleDTO getArticleById(Long articleId);
    ArticleDTO save(ArticleDTO articleDTO);
    List<ArticleDTO> findAll();
    void deleteById(Long articleId);
}

