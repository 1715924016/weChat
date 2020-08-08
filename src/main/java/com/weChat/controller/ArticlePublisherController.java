package com.weChat.controller;

import com.weChat.entity.ArticlePublisher;
import com.weChat.service.ArticlePublisherService;
import com.weChat.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publisher")
public class ArticlePublisherController {

    @Autowired
    private ArticlePublisherService articlePublisherService;


    /**
     * 功能描述:
     * 〈根据作者id查询作者信息〉
     *
     * @Param: [pId]
     * @Return: com.weChat.utils.JSONResult
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020/8/4 11:14
     **/
    @GetMapping("/queryPublisherByPId")
    public JSONResult queryPublisherByPId(String pId) {
        ArticlePublisher result = articlePublisherService.queryPublisherByPId(pId);
        return JSONResult.ok(result);
    }
}
