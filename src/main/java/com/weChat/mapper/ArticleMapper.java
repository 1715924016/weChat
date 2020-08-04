package com.weChat.mapper;

import com.weChat.entity.Article;
import com.weChat.utils.MainMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends MainMapper<Article> {
}