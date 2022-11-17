package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String hello(Model model) {
    	model.addAttribute("name", "seungjin");
        return "index";
    }

    @ResponseBody
    @GetMapping("/test1")
    public String valueTest() {
        String value = "test1";
        return value;
    }

}
