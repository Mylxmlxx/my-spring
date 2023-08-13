package com.yzy.springframework.beans.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author yzy
 * @version 1.0
 * @description 网址资源
 * @date 2023/8/13 10:02
 */
public class UrlResource implements Resource {
    private final URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "UrlResource{}";
    }

    @Override
    public InputStream getInputStream() throws Exception {
        URLConnection con = this.url.openConnection();
        try {
            return con.getInputStream();
        } catch (IOException e) {
            if (con instanceof HttpURLConnection) {
                ((HttpURLConnection) con).disconnect();
            }
            throw e;
        }
    }
}
