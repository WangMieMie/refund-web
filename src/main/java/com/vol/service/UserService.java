package com.vol.service;

import com.vol.beans.User;

/**
 * @Class UserService
 * @Descriptions
 * @Author vol
 * @Date 2017/9/7 12:56
 */
public interface UserService {

    /**
     * 用户登录验证
     *
     * @param username
     * @param password
     * @return
     */
    boolean login(User user);
}
