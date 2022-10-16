package com.zhang.service;

import com.zhang.pojo.Picture;

import java.util.List;

/**
 * 图片服务
 *
 * @author Administrator
 * @Description: 照片墙业务层接口
 * @Date: Created in 23:30 2020/4/16
 * @date 2022/10/12
 */
public interface PictureService {

    //查询照片
    List<Picture> listPicture();

    //添加图片
    int savePicture(Picture picture);

    //根据id查询照片
    Picture getPicture(Long id);

//    编辑修改相册
    int updatePicture(Picture picture);

//    删除照片
    void deletePicture(Long id);

}