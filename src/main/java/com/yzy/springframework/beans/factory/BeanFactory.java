package com.yzy.springframework.beans.factory;

import com.yzy.springframework.beans.BeansException;

/**
 *
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
