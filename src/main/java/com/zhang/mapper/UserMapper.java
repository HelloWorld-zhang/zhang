package com.zhang.mapper;

import com.zhang.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> findAll();

    public List<User> findById(int id);

    public User addUser(User user);

    public int deleteId(int id);
}
