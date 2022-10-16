package com.zhang.service;

import com.zhang.pojo.User;

/**
 * 用户服务
 *
 * @author Administrator
 * @Description: 用户业务层接口
 * @date 2022/10/12
 */
public interface UserService {

//    核对用户名和密码
    User checkUser(String username, String password);

}