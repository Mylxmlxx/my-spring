package com.yzy.springframework.beans.core.io;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;

/**
 * @author yzy
 * @version 1.0
 * @description TODO
 * @date 2023/8/13 9:55
 */
public class FileSystemResource implements Resource {
    private final File file;
    private final String path;

    public FileSystemResource(File file) {
        this.file = file;
        this.path = file.getPath();
    }

    public FileSystemResource(String path) {
        this.path = path;
        this.file = new File(path);
    }

    @Override
    public InputStream getInputStream() throws Exception {
        return Files.newInputStream(file.toPath());
    }

    /**
     * 获取文件路径（不可被子类继承）
     * @return
     */
    public final String getPath() {
        return path;
    }

}
