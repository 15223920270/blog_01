package com.zhang.dao;

import com.zhang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 用户刀
 *
 * @author Administrator
 * @Description: 用户持久层接口
 * @date 2022/10/12
 */
@Mapper
@Repository
public interface UserDao {
    User findByUsernameAndPassword(@Param("username") String username,@Param("password") String password);
}