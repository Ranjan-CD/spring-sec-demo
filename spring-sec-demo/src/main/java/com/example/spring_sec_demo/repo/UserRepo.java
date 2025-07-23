package com.example.spring_sec_demo.repo;

import com.example.spring_sec_demo.model.Student;
import com.example.spring_sec_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String userName);
}
