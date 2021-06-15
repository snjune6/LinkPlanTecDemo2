package com.example.demo2.springboot.web;

import com.example.demo2.springboot.web.service.CategoryService;
import com.example.demo2.springboot.web.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    // 카테고리
    private final CategoryService categoryService;
    // 메뉴
    private final MenuService menuService;

    @GetMapping(value = {"/", "/index"})
    public String main(Model model) {
        /*
        CategorySaveRequestDto requestDto = new CategorySaveRequestDto(10L,"1","@","@","3","@","%");

        Long i = categoryService.save(requestDto);
        */

        //model.addAttribute("categoryList", categoryService.findAllDesc());

        // 1레밸 메뉴
        model.addAttribute("dept1menu", menuService.dept1menu());

        return "web/index/index";
    }

    @GetMapping("/test")
    public String test() {
        return "web/test/index";
    }

}
