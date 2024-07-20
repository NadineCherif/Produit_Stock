package com.example.article.article;

import lombok.Builder;

@Builder
public record StockDTO(String stockId, String zone) {
}
