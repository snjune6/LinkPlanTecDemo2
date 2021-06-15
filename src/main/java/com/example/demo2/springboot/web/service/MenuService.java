package com.example.demo2.springboot.web.service;

import com.example.demo2.springboot.domain.menu.MenuRepository;
import com.example.demo2.springboot.dto.menu.MenuListReponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Transactional(readOnly = true)
    public List<MenuListReponseDto> dept1menu() {
        return menuRepository
                .dept1menu()
                .stream()
                .map(MenuListReponseDto::new)
                .collect(Collectors.toList());
    }
}
