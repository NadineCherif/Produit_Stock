package com.example.article.article;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Stock")
public interface StockClient {

    @GetMapping("/stocks/{id}")
   // @CircuitBreaker(name="",fallBackMethod="")
    StockDTO getStockById(@PathVariable("id") String id);

}
