package com.nipa.abandon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DonateController {
    @GetMapping("/donate")
    public String donate(){
        return "/pagelist/donate";
    }
}
