package com.example.money_lover_ver_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @GetMapping("/admin")
    public ModelAndView showAdminPage(){
        return new ModelAndView("admin");
    }

    @GetMapping("/member")
    public ModelAndView showMemberPage(){
        return new ModelAndView("member");
    }

    @GetMapping("/khongcoquyen")
    public ModelAndView showNoPage(){
        return new ModelAndView("khongcoquyen");
    }
}
