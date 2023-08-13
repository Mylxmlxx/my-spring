package com.yzy.springframework.beans.core.io;

import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author yzy
 * @version 1.0
 * @description 类路径资源
 * @date 2023/8/13 9:52
 */
public class ClassPathResource implements Resource {

    private final String path;
    private ClassLoader classLoader;

    public ClassPathResource(String path) {
        this(path, (ClassLoader) null);
    }

    public ClassPathResource(String path, ClassLoader classLoader) {
        Assert.notNull(path, "Path must not be null");
        this.path = path;
        this.classLoader = (classLoader != null ? classLoader : ClassUtils.getDefaultClassLoader());
    }

    @Override
    public InputStream getInputStream() throws Exception {
        InputStream is = classLoader.getResourceAsStream(path);
        if (is == null) throw new FileNotFoundException("can not find file by path:" + path);
        return is;
    }
}
