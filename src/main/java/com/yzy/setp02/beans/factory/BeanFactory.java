package com.yzy.setp02.beans.factory;

import com.yzy.setp02.beans.BeansException;

/**
 *
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
