package com.zhang.service.Impl;

import com.zhang.dao.UserDao;
import com.zhang.pojo.User;
import com.zhang.service.UserService;
import com.zhang.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务impl
 *
 * @author Administrator
 * @Description: 用户业务层接口实现类
 * @date 2022/10/12
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}