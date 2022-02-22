package com.RMS.Restaurant.controller;

import com.RMS.Restaurant.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 **/
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;


//    @PostMapping(value = "/index")
//    public String login(String userName){
//
//        return "login";
//    }


}
