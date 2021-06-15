package com.example.demo2.springboot.domain.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query(value = "SELECT * FROM category WHERE use_fl='Y' AND del_fl='N' AND parent_id='1' ORDER BY order_by", nativeQuery = true)
    List<Category> selectCategoryStep();
}
