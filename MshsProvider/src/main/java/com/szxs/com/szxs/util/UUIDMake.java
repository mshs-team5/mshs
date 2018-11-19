package com.szxs.com.szxs.util;

import java.util.UUID;

/**
 * Created by RH on 2018/6/24.
 */
public class UUIDMake {
    /**
     * 获取UUID
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
