package com.zhang.service.iml;

import com.zhang.entity.User;
import com.zhang.mapper.UserMapper;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<User> findById(int id) {
        return  userMapper.findById(id);
    }

    @Override
    public User addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteId(int id) {
        return userMapper.deleteId(id);
    }
}
