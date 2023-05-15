package spring.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
