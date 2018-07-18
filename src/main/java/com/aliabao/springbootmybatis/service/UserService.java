package com.aliabao.springbootmybatis.service;

import com.aliabao.springbootmybatis.pojo.User;

public interface UserService {

    public User getUserById(int userId);

    boolean addUser(User record);
}
