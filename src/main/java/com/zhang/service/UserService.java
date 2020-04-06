package com.zhang.service;

import com.zhang.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public List<User> findById(int id);

    public User addUser(User user);

    public int  deleteId(int id);
}
