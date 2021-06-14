package com.example.demo2.springboot.dto;

import com.example.demo2.springboot.domain.category.Category;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CategoryListResponseDto {

    private Long id;
    private Long parentId;
    private String categoryNm;
    private String categoryGb;
    private String categoryMemo;
    private String useFl;
    private String delFl;
    private String menuFl;

    private LocalDateTime modifiedDate;
    private LocalDateTime createdDate;

    public CategoryListResponseDto(Category entity) {
        this.id = entity.getId();
        this.parentId = entity.getParentId();
        this.categoryNm = entity.getCategoryNm();
        this.categoryGb = entity.getCategoryGb();
        this.categoryMemo = entity.getCategoryMemo();
        this.useFl = entity.getUseFl();
        this.delFl = entity.getDelFl();
        this.menuFl = entity.getMenuFl();
        this.modifiedDate = entity.getModifiedDate();
        this.createdDate = entity.getCreatedDate();
    }
}
