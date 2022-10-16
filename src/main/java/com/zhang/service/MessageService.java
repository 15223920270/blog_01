package com.zhang.service;


import com.zhang.pojo.Message;

import java.util.List;

/**
 * 消息服务
 *
 * @author Administrator
 * @Description: 留言业务层接口
 * @Date: Created in 11:23 2020/4/16
 * @date 2022/10/12
 */
public interface MessageService {

    //查询留言列表
    List<Message> listMessage();

    //保存留言
    int saveMessage(Message message);

    //删除留言
    void deleteMessage(Long id);

}