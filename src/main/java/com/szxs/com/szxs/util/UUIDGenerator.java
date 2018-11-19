package com.szxs.com.szxs.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;


public class UUIDGenerator {
    public UUIDGenerator() {
    }
    
    
    /**
     * 获取 orderCode
     * @return
     */
    public static synchronized String getOrderCode(){
    	SimpleDateFormat sim = new SimpleDateFormat("yyyyMMddHHmmss");
        String strDate =sim.format(new Date());
        return strDate+getRandom620(6);
    }
    /**
     * 获取6-10 的随机位数数字
     * @param length	想要生成的长度
     * @return result
     */
    public static  String getRandom620(Integer length) {
        String result = "";
        Random rand = new Random();
        int n = 20;
        if (null != length && length > 0) {
            n = length;
        }
        int randInt = 0;
        for (int i = 0; i < n; i++) {
            randInt = rand.nextInt(10);
            result += randInt;
        }
        return result;
    }

    /**
     * 获得一个UUID
     *
     * @return String UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 获得指定数目的UUID
     *
     * @param number int 需要获得的UUID数量
     * @return String[] UUID数组
     */
    public static String[] getUUID(int number) {
        if (number < 1) {
            return null;
        }
        String[] ss = new String[number];
        for (int i = 0; i < number; i++) {
            ss[i] = getUUID();
        }
        return ss;
    }

}  