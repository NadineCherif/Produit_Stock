package com.example.article.article;

import lombok.Builder;

@Builder
public record ArticleDTO(Long articleId,String name, Float quantity, String stockId, StockDTO stockDTO) {


}
