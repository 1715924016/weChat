package com.weChat.service.impl;

import com.weChat.entity.ArticleType;
import com.weChat.mapper.ArticleTypeMapper;
import com.weChat.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleTypeServiceImpl implements ArticleTypeService {

    @Autowired
    private ArticleTypeMapper articleTypeMapper;

    /**
     * @return List<ArticleType>
     * @Description: 查询所有文章类型；
     */
    public List<ArticleType> queryAllType() {
        List<ArticleType> types = new ArrayList<ArticleType>();
        List<ArticleType> articleTypes = articleTypeMapper.selectAll();
        // 只获取有效数据：status:0
        if (articleTypes.size() > 0) {
            for (ArticleType at : articleTypes) {
                if ("0".equalsIgnoreCase(at.getStatus())) {
                    types.add(at);
                }
            }
        }
        return types;
    }
}
