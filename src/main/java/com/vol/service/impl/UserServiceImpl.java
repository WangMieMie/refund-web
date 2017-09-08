package com.vol.service.impl;

import com.vol.beans.User;
import com.vol.mapper.UserMapper;
import com.vol.service.UserService;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Class UserServiceImpl
 * @Descriptions
 * @Author vol
 * @Date 2017/9/7 12:57
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(User user) {
        String pwd = MD5Encoder.encode(user.getPassword().getBytes());
        user.setPassword(pwd);
        return userMapper.selectOne(user) != null;
    }
}
