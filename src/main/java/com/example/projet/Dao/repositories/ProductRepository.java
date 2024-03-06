package com.example.projet.Dao.repositories;


import com.example.projet.Dao.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product, Long> {
    static void saved(product product) {
    }
}
