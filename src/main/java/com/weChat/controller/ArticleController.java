package com.weChat.controller;

import com.weChat.service.ArticleService;
import com.weChat.utils.JSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Article")
public class ArticleController {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    private ArticleService articleService;

    /**
     * 功能描述:
     * 〈查询不同类型的文章〉
     *
     * @Param: [articleTypeId]
     * @Return: com.weChat.utils.JSONResult
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020/8/4 11:18
     **/
    @GetMapping("/queryAllArticleByType/{articleTypeId}")
    public JSONResult queryAllArticleByType(@PathVariable String articleTypeId) {
        logger.info("根据类型查文章：queryAllArticleByType");
        List<Map<String, Object>> result = articleService.queryAllArticleByType(articleTypeId);
        return JSONResult.ok(result);
    }

    /**
     * 功能描述:
     * 〈上传图片〉
     *
     * @Param: [uploadPhoto]
     * @Return: com.weChat.utils.JSONResult
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020年8月22日
     **/
    @PostMapping("/uploadPhoto")
    public JSONResult uploadPhoto(HttpServletRequest request, @RequestParam("file") MultipartFile file) {
        logger.info("根据类型查文章：queryAllArticleByType");
        List<LinkedHashMap<String, Object>> result = articleService.uploadPhoto(request, file);
        return JSONResult.ok(result);
    }
}
