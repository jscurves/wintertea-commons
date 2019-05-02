package com.wintertea.commons.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Mapper基础类
 * @author woody
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
