package com.nisum.test.demo.controller;

import com.nisum.test.demo.dto.PhoneDto;
import com.nisum.test.demo.model.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping("/")
    public String home() {

        return "home.jsp";
    }

    @RequestMapping("/add")
    public PhoneDto addUser() {
        return PhoneDto.builder().number("12232222").build();
    }
}
