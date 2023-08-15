package com.example.demo;

import org.springframework.stereotype.Service;

import com.example.demo.Controller.UserData;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor

public class DataService {
 
    private final Repository repository;

   
   public void writeData(UserData data) {

        Users users = new Users();
        users.setEmail(data.getEmail());
        users.setName(data.getName());
        repository.save(users);

    }


    
}
