package com.forewei.utils;

import java.util.UUID;

/**
 * @Athor forewei
 * @Email forewei2015@gmail.com
 * @Date 2020/1/4
 */
public class UUIDUtil {
    /**
     * 生成uuid
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
