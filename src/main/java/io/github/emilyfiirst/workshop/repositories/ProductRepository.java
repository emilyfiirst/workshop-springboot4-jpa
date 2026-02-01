package io.github.emilyfiirst.workshop.repositories;

import io.github.emilyfiirst.workshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
