package com.lms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

@GetMapping("/login")
 public String getRequest() {
 System.out.println("returning from Login user....");
 return "home";
 }

@GetMapping("/registration")
public String registerUser() {
System.out.println("returning from Login user....");
return "register";
}

}