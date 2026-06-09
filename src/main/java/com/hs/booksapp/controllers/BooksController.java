package com.hs.booksapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {


  @GetMapping
    public String hello(){
      System.out.println("Sample Workflow!");
        return  "Hello World";
    }
}
