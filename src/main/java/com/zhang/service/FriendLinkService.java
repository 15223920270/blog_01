package com.zhang.service;

import com.zhang.pojo.FriendLink;

import java.util.List;

/**
 * 朋友联系服务
 *
 * @author Administrator
 * @Description: 友链业务层接口
 * @date 2022/10/12
 */
public interface FriendLinkService {

    //查询所有友链
    List<FriendLink> listFriendLink();

    //友链新增
    int saveFriendLink(FriendLink friendLink);

    //根据id查询友链
    FriendLink getFriendLink(Long id);

    //根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogaddress);

    //编辑修改友链
    int updateFriendLink(FriendLink friendLink);

    //删除友链
    void deleteFriendLink(Long id);


}