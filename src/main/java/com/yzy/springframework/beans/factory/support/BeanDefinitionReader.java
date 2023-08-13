package com.yzy.springframework.beans.factory.support;

import com.yzy.springframework.beans.core.io.Resource;
import com.yzy.springframework.beans.core.io.ResourceLoader;

/**
 * @author yzy
 * @version 1.0
 * @description TODO
 * @date 2023/8/13 10:13
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws Exception;

    void loadBeanDefinitions(Resource... resource) throws Exception;

    void loadBeanDefinitions(String location) throws Exception;

}
