package com.example.demo2.springboot.web.service;

import com.example.demo2.springboot.domain.category.Category;
import com.example.demo2.springboot.domain.category.CategoryRepository;
import com.example.demo2.springboot.dto.CategoryListResponseDto;
import com.example.demo2.springboot.dto.CategoryRequestDto;
import com.example.demo2.springboot.dto.CategorySaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryListResponseDto> findAllDesc() {
        return categoryRepository
                .findAll()
                .stream()
                .map(CategoryListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Long save(CategorySaveRequestDto requestDto) {
        Long parentId = 10L;
        String categoryNm = "카테고리이름";
        String categoryGb = "카테고리구분";
        String categoryMemo = "카테고리메모";
        String useFl = "Y";
        String delFl = "N";
        String menuFl = "Y";
        return categoryRepository.save(requestDto.toEntity()).getId();
    }

}
