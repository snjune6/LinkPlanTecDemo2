package com.example.demo2.springboot.web;

import com.example.demo2.springboot.dto.CategoryRequestDto;
import com.example.demo2.springboot.dto.CategorySaveRequestDto;
import com.example.demo2.springboot.web.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Controller
public class IndexController {

    // 카테고리
    private final CategoryService categoryService;

    @GetMapping(value = {"/", "/index"})
    public String main(Model model) {
        CategorySaveRequestDto requestDto = new CategorySaveRequestDto(10L,"1","@","@","3","@","%");

        Long i = categoryService.save(requestDto);


        model.addAttribute("categoryList", categoryService.findAllDesc());
        return "web/layout/index/main";
    }

}
