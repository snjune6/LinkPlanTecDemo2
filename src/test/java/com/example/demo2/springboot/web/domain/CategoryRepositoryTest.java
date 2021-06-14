package com.example.demo2.springboot.web.domain;

import com.example.demo2.springboot.domain.category.Category;
import com.example.demo2.springboot.domain.category.CategoryRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import  static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CategoryRepositoryTest {

    @Autowired
    CategoryRepository categoryRepository;

    @AfterEach
    public void cleanup() {
        categoryRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        String categoryNm = "카테고리이름";
        String categoryGb = "카테고리구분";
        String categoryMemo = "카테고리메모";
        String useFl = "Y";
        String delFl = "N";
        String menuFl = "Y";

        categoryRepository.save(Category.builder()
                .categoryNm(categoryNm)
                .categoryGb(categoryGb)
                .categoryMemo(categoryMemo)
                .useFl(useFl)
                .delFl(delFl)
                .menuFl(menuFl).build());

        //when
        List<Category> categoryList = categoryRepository.findAll();

        //then
        Category category = categoryList.get(0);
        assertThat(category.getCategoryGb()).isEqualTo(categoryGb);
    }

}
