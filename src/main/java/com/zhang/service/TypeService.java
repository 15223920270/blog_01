package com.zhang.service;


import com.zhang.pojo.Type;

import java.util.List;


/**
 * 服务类型
 *
 * @author Administrator
 * @Description: 文章分类业务层接口
 * @date 2022/10/12
 */
public interface TypeService {

    int saveType(Type type);

    Type getType(Long id);

    List<Type>getAllType();

    List<Type>getAllTypeAndBlog();

    Type getTypeByName(String name);

    int updateType(Type type);

    void deleteType(Long id);




}