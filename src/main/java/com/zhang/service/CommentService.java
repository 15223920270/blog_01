package com.zhang.service;

import com.zhang.pojo.Comment;

import java.util.List;

/**
 * 评论服务
 *
 * @author Administrator
 * @Description: 博客评论业务层接口
 * @date 2022/10/12
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    int saveComment(Comment comment);

//    查询子评论
//    List<Comment> getChildComment(Long blogId,Long id);

    //删除评论
    void deleteComment(Comment comment,Long id);

}