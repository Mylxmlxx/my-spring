package com.yzy.springframework.beans.core.io;

/**
 * @author yzy
 * @version 1.0
 * @description 资源加载程序
 * @date 2023/8/13 10:05
 */
public interface ResourceLoader {
    String CLASS_PATH_PREFIX = "classpath:";

    Resource getResource(String location);
}
