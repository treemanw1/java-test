package com.example.java_test.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {
	@GetMapping("/")
    public String showForm() {
        return "form";
    }
}
