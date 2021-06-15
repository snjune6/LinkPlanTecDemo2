package com.example.demo2.springboot.web.service;

import com.example.demo2.springboot.domain.category.CategoryRepository;
import com.example.demo2.springboot.dto.category.CategoryListResponseDto;
import com.example.demo2.springboot.dto.category.CategorySaveRequestDto;
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
        return categoryRepository.save(requestDto.toEntity()).getId();
    }

}
