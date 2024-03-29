package com.lacram.studysiteproject.repository;

import com.lacram.studysiteproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUserid(String user_id);
}
