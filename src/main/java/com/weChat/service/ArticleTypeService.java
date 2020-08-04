package com.weChat.service;


import com.weChat.entity.ArticleType;

import java.util.List;

public interface ArticleTypeService {

    /**
     * 功能描述:
     * 〈查询所有文章类型〉
     *
     * @Param: []
     * @Return: java.util.List<com.weChat.entity.ArticleType>
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020/8/4 11:15
     **/
    public List<ArticleType> queryAllType();
}
