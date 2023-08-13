package com.yzy.springframework.beans.factory.support;

import com.yzy.springframework.beans.core.io.DefaultResourceLoader;
import com.yzy.springframework.beans.core.io.ResourceLoader;

/**
 * @author yzy
 * @version 1.0
 * @description TODO
 * @date 2023/8/13 10:16
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {
    private final BeanDefinitionRegistry registry;
    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());

    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
