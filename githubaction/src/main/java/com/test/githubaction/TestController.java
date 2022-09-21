package com.test.githubaction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {
    @GetMapping("/")
    public String test(){
        return "test.html";
    }
}
