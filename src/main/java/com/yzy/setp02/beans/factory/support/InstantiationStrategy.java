package com.yzy.setp02.beans.factory.support;


import com.yzy.setp02.beans.factory.config.BeanDefinition;
import org.springframework.beans.BeansException;

import java.lang.reflect.Constructor;

/**
 * <p>
 * Bean 实例化策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
