package com.example.demo2.springboot.domain.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
/*
    @Query(value = "SELECT * FROM category ORDER BY id desc", nativeQuery = true)
    List<Category> findAllDesc();*/
}
