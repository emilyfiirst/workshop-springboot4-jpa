package io.github.emilyfiirst.workshop.repositories;

import io.github.emilyfiirst.workshop.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
