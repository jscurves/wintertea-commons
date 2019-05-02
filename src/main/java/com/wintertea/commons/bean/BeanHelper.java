package com.wintertea.commons.bean;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Bean处理信息
 * @author woody
 */
public class BeanHelper {

    /**
     * 拷贝对象
     * @param source 源对象
     * @param clazz 转换对象
     * @param <T> 对象泛型
     * @return T 结果对象
     * @throws IllegalAccessException 不能实例化异常
     * @throws InstantiationException 安全权限异常
     */
    public static <T> T copyProperties(Object source, Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T entity = clazz.newInstance();
        BeanUtils.copyProperties(source, entity);
        return entity;
    }

    /**
     * 拷贝集合对象
     * @param source 对象结合
     * @param clazz 转换对象
     * @param <T> 对象泛型
     * @return List<T> 转换对象集合
     * @throws IllegalAccessException 不能实例化异常
     * @throws InstantiationException 安全权限异常
     */
    public static <T> List<T> copyProperties(List<Object> source, Class<T> clazz) throws IllegalAccessException, InstantiationException {
        List<T> result = new ArrayList<>(source.size());
        for (Object object : source) {
            T entity = copyProperties(object, clazz);
            result.add(entity);
        }
        return result;
    }

    /**
     * 分页结果
     * @param result 集合结果
     * @param clazz 转换对象
     * @param <T> 转换对象泛型
     * @return PageInfo<T> 分页结果集合
     * @throws InstantiationException 不能实例化异常
     * @throws IllegalAccessException 安全权限异常
     */
    public static  <T> PageInfo<T> toPageInfo(List<Object> result, Class<T> clazz) throws InstantiationException, IllegalAccessException {
        List<T> resultPageInfo = copyProperties(result, clazz);
        return new PageInfo<>(resultPageInfo);
    }
}