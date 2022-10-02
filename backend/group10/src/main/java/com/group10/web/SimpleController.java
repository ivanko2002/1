package com.group10.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class SimpleController {
    @GetMapping("/")
    public ResponseEntity<String> homePage(){
        System.out.println("HelloWorld");
        return new ResponseEntity<>("Hello", HttpStatus.valueOf(200));
    }
}