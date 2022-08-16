package com.example.demo.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/page")
    public String indexPage(Model model) {
        model.addAttribute("text", "Lorem ipsum");
        return "index";
    }
}
