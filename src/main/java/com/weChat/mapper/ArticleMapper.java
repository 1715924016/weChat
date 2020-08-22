package com.weChat.mapper;

import com.weChat.entity.Article;
import com.weChat.utils.MainMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Component//把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
public interface ArticleMapper extends MainMapper<Article> {
}