package com.example.fashionblog_api.repositories;

import com.example.fashionblog_api.models.User;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

   Optional<User> findByEmail(String email);
   Optional<User> findUserById(Long id);
   boolean existsByEmail(String email);

   Optional<User> findUserByEmailAndPassword(String email, String password);

}
