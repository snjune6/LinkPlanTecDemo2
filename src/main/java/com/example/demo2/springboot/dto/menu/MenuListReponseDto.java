package com.example.demo2.springboot.dto.menu;

import com.example.demo2.springboot.domain.menu.Menu;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MenuListReponseDto {

    private Long id;
    private String menuId;
    private String menuNm;
    private String menuLink;
    private String description;
    private String alt;
    private String useAt;
    private String delAt;
    private Long orderBy;

    private LocalDateTime modifiedDate;
    private LocalDateTime createdDate;

    public MenuListReponseDto(Menu entity) {
        this.id = entity.getId();
        this.menuId = entity.getMenuId();
        this.menuNm = entity.getMenuNm();
        this.menuLink = entity.getMenuLink();
        this.description = entity.getDescription();
        this.alt = entity.getAlt();
        this.useAt = entity.getUseAt();
        this.delAt = entity.getDelAt();
        this.orderBy = entity.getOrderBy();
        this.modifiedDate = entity.getModifiedDate();
        this.createdDate = entity.getCreatedDate();
    }

}
