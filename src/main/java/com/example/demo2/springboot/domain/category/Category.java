package com.example.demo2.springboot.domain.category;

import com.example.demo2.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Category extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long parentId;

    @Column(length = 100, nullable = false)
    private String categoryNm;

    @Column(length = 50, nullable = false)
    private String categoryGb;

    @Column(length = 255, nullable = false)
    private String categoryMemo;

    @Column(length = 1, nullable = false)
    private String useFl;

    @Column(length = 1, nullable = false)
    private String delFl;

    @Column(length = 1)
    private String menuFl;

    @Column
    private Long orderBy;


    @Builder
    public Category(Long parentId, String categoryNm, String categoryGb, String categoryMemo, String useFl, String delFl, String menuFl, Long orderBy){
        this.parentId = parentId;
        this.categoryNm = categoryNm;
        this.categoryGb = categoryGb;
        this.categoryMemo = categoryMemo;
        this.useFl = useFl;
        this.delFl = delFl;
        this.menuFl = menuFl;
        this.orderBy = orderBy;
    }
}