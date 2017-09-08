package com.vol.commons;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Class BaseMapper
 * @Descriptions 通用mapper
 * @Author vol
 * @Date 2017/9/7 14:00
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
