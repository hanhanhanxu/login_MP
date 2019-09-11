package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.po.User;
import com.example.demo.utils.WebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Integer saveUser(User user){
        user.setPassWord(WebUtil.md5(user.getPassWord()));
        return userMapper.insert(user);
    }
    public User searchUserByUsernameAndPassword(User user){
        user.setPassWord(WebUtil.md5(user.getPassWord()));
        return userMapper.selectOne(user);
    }
}
