package com.tech.deploy.controller;

import com.tech.deploy.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/home")
public class HomeController {
    @Autowired
    HomeService homeService;

    @GetMapping("/hello")
    public ResponseEntity<String> welcomeFunction(){
     return  ResponseEntity.ok( homeService.getString());
    }
}
