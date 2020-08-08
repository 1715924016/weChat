package com.weChat.service;

import com.weChat.entity.ArticlePublisher;

public interface ArticlePublisherService {

    /**
     * 功能描述:
     * 〈根据作者id查询作者信息〉
     *
     * @Param: [pId]
     * @Return: ArticlePublisher
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020/8/4 11:16
     **/
    ArticlePublisher queryPublisherByPId(String pId);
}