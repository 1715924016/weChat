package com.weChat.service.impl;

import com.weChat.entity.ArticlePublisher;
import com.weChat.mapper.ArticlePublisherMapper;
import com.weChat.service.ArticlePublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArticlePublisherServiceImpl implements ArticlePublisherService {

    @Autowired
    private ArticlePublisherMapper articlePublisherMapper;

    /**
     * 功能描述:
     * 〈根据作者id查询作者信息〉
     *
     * @Param: [pId]
     * @Return: ArticlePublisher
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020/8/4 11:16
     **/
    @Override
    public ArticlePublisher queryPublisherByPId(String pId) {
        // 查询pid所代指的作者信息
        ArticlePublisher articlePublisher = articlePublisherMapper.selectByPrimaryKey(pId);
        return articlePublisher;
    }
}
