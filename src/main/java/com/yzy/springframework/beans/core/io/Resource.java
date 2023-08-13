package com.yzy.springframework.beans.core.io;

import java.io.InputStream;

/**
 * @author yzy
 * @version 1.0
 * @description TODO
 * @date 2023/8/13 9:51
 */
public interface Resource {
    InputStream getInputStream() throws Exception;
}
