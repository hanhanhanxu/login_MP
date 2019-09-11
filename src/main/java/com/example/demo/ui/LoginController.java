package com.example.demo.ui;


import com.example.demo.po.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public ResponseEntity<User> login(User user){
        User u = userService.searchUserByUsernameAndPassword(user);
        if(u!=null){
            Date date = new Date(u.getCreateTime().getTime());
            System.out.println("时间："+date);
            return ResponseEntity.ok(u);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PostMapping("regist")
    public ResponseEntity regist(User user){
        System.out.println("user:"+user);
        Integer i = userService.saveUser(user);
        System.out.println("user:"+user);
        if(i==1){
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
