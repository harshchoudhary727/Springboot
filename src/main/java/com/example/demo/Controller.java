package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/data")
@RequiredArgsConstructor
public class Controller {

    
    private final DataService src;
    @PostMapping("/post")
    public void writeData(@RequestBody UserData body)

    {
     src.writeData(body);
    


    }


    @Data
    public static class UserData {

           private String name;
          private String email;


    }


    
}
