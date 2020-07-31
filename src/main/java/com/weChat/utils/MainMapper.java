package com.weChat.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

// 注意这里需要预先指定写好的通用mapper接口,自动生成的接口全部继承这个接口
public interface MainMapper<T> extends Mapper<T>, MySqlMapper<T> {

}

