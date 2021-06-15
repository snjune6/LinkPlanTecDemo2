package com.example.demo2.springboot.dto.category;

import com.example.demo2.springboot.domain.category.Category;
import lombok.Builder;
import lombok.Getter;

@Getter
public class CategoryRequestDto {

    private Long parentId;
    private String categoryNm;
    private String categoryGb;
    private String categoryMemo;
    private String useFl;
    private String delFl;
    private String menuFl;

    @Builder
    public CategoryRequestDto(Long parentId, String categoryNm, String categoryGb, String categoryMemo, String useFl, String delFl, String menuFl) {
        /*
        this.parentId = parentId;
        this.categoryNm = categoryNm;
        this.categoryGB = categoryGb;
        this.categoryMemo = categoryMemo;
        this.useFl = useFl;
        this.delFl = delFl;
        this.menuFl = menuFl;
         */
        this.parentId = 10L;
        this.categoryNm = "categoryNm";
        this.categoryGb = "categoryGb";
        this.categoryMemo = "categoryMemo";
        this.useFl = "Y";
        this.delFl = "Y";
        this.menuFl = "Y";
    }

    @Builder
    public CategoryRequestDto() {
        /*
        this.parentId = parentId;
        this.categoryNm = categoryNm;
        this.categoryGB = categoryGb;
        this.categoryMemo = categoryMemo;
        this.useFl = useFl;
        this.delFl = delFl;
        this.menuFl = menuFl;
         */
        this.parentId = 10L;
        this.categoryNm = "categoryNm";
        this.categoryGb = "categoryGb";
        this.categoryMemo = "categoryMemo";
        this.useFl = "Y";
        this.delFl = "Y";
        this.menuFl = "Y";
    }

    public Category toEntity() {
        return Category.builder()
                .categoryNm(categoryNm)
                .categoryGb(categoryGb)
                .categoryMemo(categoryMemo)
                .useFl(useFl)
                .delFl(delFl)
                .menuFl(menuFl)
                .build();
    }

}
