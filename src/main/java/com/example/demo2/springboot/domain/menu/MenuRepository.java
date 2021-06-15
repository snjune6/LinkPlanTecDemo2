package com.example.demo2.springboot.domain.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query(value = "SELECT * FROM MENU WHERE LENGTH(MENU_ID)=2 AND USE_AT='Y' AND DEL_AT='N' ORDER BY ORDER_BY", nativeQuery = true)
    List<Menu> dept1menu();
}
