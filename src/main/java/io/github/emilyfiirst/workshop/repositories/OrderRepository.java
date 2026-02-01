package io.github.emilyfiirst.workshop.repositories;

import io.github.emilyfiirst.workshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
