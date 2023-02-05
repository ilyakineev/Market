package com.Market.Market.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(value = "/")
    public String home() {
        return "Market API";
    }

    @RequestMapping(value = "/testbranch")
    public String testBranch() {
        return "Market API / testbranch";
    }
}
