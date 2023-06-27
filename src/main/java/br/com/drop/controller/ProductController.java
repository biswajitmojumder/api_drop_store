package br.com.drop.controller;


import br.com.drop.model.entities.Product;
import br.com.drop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {

    ProductRepository productRepository;



    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Product save (@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/show/all")
    public List<Product> showAll(){
        return productRepository.findAll();
    }
}
