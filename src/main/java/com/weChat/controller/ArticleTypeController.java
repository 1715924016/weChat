package com.weChat.controller;

import com.weChat.service.ArticleTypeService;
import com.weChat.utils.JSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articleType")
public class ArticleTypeController {

    private static Logger logger = LoggerFactory.getLogger(ArticleTypeController.class);

    @Autowired
    private ArticleTypeService articleTypeService;

    /**
     * 功能描述:
     * 〈查询所有文章类型〉
     *
     * @Param: []
     * @Return: com.weChat.utils.JSONResult
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020/8/4 11:17
     **/
    @GetMapping("/queryAllType")
    public JSONResult queryAllType() {
        logger.info("查询所有文章类型：queryAllType");
        List<com.weChat.entity.ArticleType> result = articleTypeService.queryAllType();
        return JSONResult.ok(result);
    }

}
