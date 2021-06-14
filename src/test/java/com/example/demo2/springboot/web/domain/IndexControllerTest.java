package com.example.demo2.springboot.web.domain;

import com.example.demo2.springboot.domain.category.Category;
import com.example.demo2.springboot.domain.category.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class IndexControllerTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void 조회테스트(){
        List<Category> all = categoryRepository.findAll();
        System.out.println(all);
    }
}
