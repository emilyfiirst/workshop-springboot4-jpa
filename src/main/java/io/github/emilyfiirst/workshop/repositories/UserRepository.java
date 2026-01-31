package io.github.emilyfiirst.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.emilyfiirst.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
