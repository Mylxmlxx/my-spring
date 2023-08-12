package com.yzy.setp02.support;

import com.yzy.domain.User;
import com.yzy.setp02.beans.factory.config.BeanDefinition;
import com.yzy.setp02.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

class AbstractAutowireCapableBeanFactoryTest {
    @Test
    void test() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(User.class);
        beanFactory.registerBeanDefinition("user", beanDefinition);
        // 3.第一次获取 bean
        User user = (User) beanFactory.getBean("user");
        user.getAge();
        // 4.第二次获取 bean from Singleton
        User userSingleton = (User) beanFactory.getBean("user");
        userSingleton.getAge();
    }
}