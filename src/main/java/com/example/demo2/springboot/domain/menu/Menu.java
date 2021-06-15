package com.example.demo2.springboot.domain.menu;

import com.example.demo2.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Menu extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String menuId;

    @Column(length = 255, nullable = false)
    private String menuNm;

    @Column(length = 255, nullable = false)
    private String menuLink;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Column(length = 200, nullable = false)
    private String alt;

    @Column(length = 1, nullable = false)
    private String useAt;

    @Column(length = 1, nullable = false)
    private String delAt;

    @Column(length = 10, nullable = false)
    private Long orderBy;

    @Builder
    public Menu(String menuId, String menuNm, String menuLink, String description, String alt, String useAt, String delAt, Long orderBy) {
        this.menuId = menuId;
        this.menuNm = menuNm;
        this.menuLink = menuLink;
        this.description = description;
        this.alt = alt;
        this.useAt = useAt;
        this.delAt = delAt;
        this.orderBy = orderBy;
    }
}
