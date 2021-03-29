package com.example.registrationform;

import jdk.net.SocketFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    userRepository repo;

    @GetMapping public String homepage(){
        return "hello!";
    }




    @PostMapping("/signup")
    public Optional registration(@RequestBody User user){
        repo.save(user);
        return repo.findById(user.getEid());
    }
    @PostMapping ("/signin")
    public String login(@RequestBody User user) {
        User users = repo.findByemail(user.getEmail());
        if(users==null){
            return ("invaliduser");
        }
        if(!users.getPassword().equals(user.getPassword()))
        {
//
            return ("invalid pass");
        }

    return ("success");
    }




}
