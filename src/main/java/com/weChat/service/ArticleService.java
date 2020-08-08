package com.weChat.service;

import java.util.List;
import java.util.Map;

public interface ArticleService {

    /**
     * 功能描述:
     * 〈根据类型查文章〉
     *
     * @return
     * @Param: [articleTypeId]
     * @Return: java.util.List<com.weChat.entity.Article>
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020/8/4 11:16
     */
    List<Map<String, Object>> queryAllArticleByType(String articleTypeId);
}
