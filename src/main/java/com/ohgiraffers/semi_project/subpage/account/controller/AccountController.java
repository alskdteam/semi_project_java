package com.ohgiraffers.semi_project.subpage.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subpage")
public class AccountController {

    @GetMapping("/account")
    public void account(){}

    
}
