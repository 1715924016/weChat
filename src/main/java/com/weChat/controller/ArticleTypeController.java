package com.weChat.controller;

import com.weChat.service.ArticleTypeService;
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

    private Logger logger= LoggerFactory.getLogger(ArticleTypeController.class);

    @Autowired
    private ArticleTypeService articleTypeService;

    /**
     * @return List<ArticleType>
     * @Description: 查询所有文章类型；
     */
    @GetMapping("/queryAllType")
    public List queryAllType() {
        logger.info("查询所有文章类型：queryAllType");
        List<com.weChat.entity.ArticleType> result = articleTypeService.queryAllType();
        return result;
    }
}
