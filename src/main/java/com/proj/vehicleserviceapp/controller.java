package com.proj.vehicleserviceapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class controller {
   @RequestMapping(value = "/index")
   public String loading() {
      return "loading";
   }

   @RequestMapping(value = "/login")
   public String login(){
       return "login";
   }
   
}
