package com.proj.vehicleserviceapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
    @GetMapping("/")
    public String home() {
        return "Welcome to the Service App!";
    }
}
