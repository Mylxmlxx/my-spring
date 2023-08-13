package com.yzy.setp02.support;

import com.yzy.domain.Pen;
import com.yzy.domain.User;
import com.yzy.setp02.beans.PropertyValue;
import com.yzy.setp02.beans.PropertyValues;
import com.yzy.setp02.beans.factory.config.BeanDefinition;
import com.yzy.setp02.beans.factory.config.BeanReference;
import com.yzy.setp02.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

class AbstractAutowireCapableBeanFactoryTest {
    @Test
    void test() {
        // 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 设置属性
        beanFactory.registerBeanDefinition("pen", new BeanDefinition(Pen.class));
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "MG"));
        propertyValues.addPropertyValue(new PropertyValue("age", 18));
        propertyValues.addPropertyValue(new PropertyValue("pen", new BeanReference("pen")));

        // 设置 BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(User.class, propertyValues);
        // 注册 BeanDefinition
        beanFactory.registerBeanDefinition("user", beanDefinition);

        User user = (User) beanFactory.getBean("user");
        Pen pen = user.getPen();
        System.out.println(pen);
    }
}