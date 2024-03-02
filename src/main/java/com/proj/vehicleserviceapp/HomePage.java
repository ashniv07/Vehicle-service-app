package com.proj.vehicleserviceapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the Vehicle Service App");
        return "home";
    }
}
