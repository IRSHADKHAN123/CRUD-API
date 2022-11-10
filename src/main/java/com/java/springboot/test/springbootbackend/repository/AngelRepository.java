package com.java.springboot.test.springbootbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springboot.test.springbootbackend.model.AngelUser;



public interface AngelRepository extends JpaRepository<AngelUser, Long> {

    // all crude database methods
}
