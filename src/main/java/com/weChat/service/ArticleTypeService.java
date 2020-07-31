package com.weChat.service;


import com.weChat.entity.ArticleType;

import java.util.List;

public interface ArticleTypeService {

    /**
     * @return List<ArticleType>
     * @Description: 查询所有文章类型；
     */
    public List<ArticleType> queryAllType();
}
