package com.wintertea.commons.bean;

import org.springframework.beans.BeanUtils;

/**
 * Bean处理信息
 * @author woody
 */
public class BeanHelper {

    public static <T> T copyProperties(Object source, Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T entity = clazz.newInstance();
        BeanUtils.copyProperties(source, entity);
        return entity;
    }
}
