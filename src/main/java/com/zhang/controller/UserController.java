package com.zhang.controller;

import com.zhang.entity.User;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("findById")
    public List<User> findById(int id){
        return userService.findById(id);
    }
    @RequestMapping("addUser")
    public User addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping("deleteId")
    public int deleteId(int id){
        return userService.deleteId(id);
    }
}
