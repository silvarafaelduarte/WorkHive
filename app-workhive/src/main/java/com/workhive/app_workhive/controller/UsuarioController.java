package com.workhive.app_workhive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping("/usuario")
    public String index() {
        return "usuario/index";
    }

}
