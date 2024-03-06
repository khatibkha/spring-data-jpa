package com.example.projet;

import com.example.projet.Dao.entities.product;
import com.example.projet.Dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetApplication implements CommandLineRunner {
    @Autowired

    private ProductRepository productRepository;


    public static void main(String[] args) {
        SpringApplication.run(ProjetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        product product = new product(1, "zara", 199);
        product product1 = new product(4, "hamid", 200);
        product product3 = new product(5, "store21", 299);
        ProductRepository.saved(product);
        ProductRepository.saved(product1);

    }
}
