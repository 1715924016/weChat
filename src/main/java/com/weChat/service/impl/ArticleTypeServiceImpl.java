package com.weChat.service.impl;

import com.weChat.entity.ArticleType;
import com.weChat.mapper.ArticleTypeMapper;
import com.weChat.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ArticleTypeServiceImpl implements ArticleTypeService {

    @Autowired
    private ArticleTypeMapper articleTypeMapper;

    /**
     * 功能描述:
     * 〈查询所有文章类型〉
     *
     * @Param: []
     * @Return: java.util.List<com.weChat.entity.ArticleType>
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020/8/4 11:18
     **/
    public List<ArticleType> queryAllType() {

        Example example = new Example(ArticleType.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("status", "1");

        return articleTypeMapper.selectByExample(example);
    }
}
