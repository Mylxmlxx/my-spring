package com.yzy.springframework.beans.core.io;

import org.springframework.util.Assert;

import java.net.URL;

/**
 * @author yzy
 * @version 1.0
 * @description 默认资源加载程序
 * @date 2023/8/13 10:06
 */
public class DefaultResourceLoader implements ResourceLoader {
    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "location must not be null");
        if (location.startsWith(CLASS_PATH_PREFIX)) {
            return new ClassPathResource(location.substring(CLASS_PATH_PREFIX.length()));
        } else {
            try {
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (Exception e) {
                return new FileSystemResource(location);
            }
        }
    }
}
