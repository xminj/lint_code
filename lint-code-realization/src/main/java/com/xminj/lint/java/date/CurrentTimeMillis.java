package com.xminj.lint.java.date;

import java.text.SimpleDateFormat;

/**
 * 背景：在内网Linux系统中，使用{@link SimpleDateFormat}创建的日期会时不时的出现问题。
 * 解决办法：使用System.currentTimeMillis()创建不受时区影响的日期
 */
public class CurrentTimeMillis {

    /**
     * 返回每分钟的时间
     */
    private static String createTime(){
        long longTime = System.currentTimeMillis();
        return new SimpleDateFormat("YYYYMMddHHmm").format(longTime);
    }

    public static void main(String[] args) {
        // 2020 01 19 15 47
        // 2020 01 19 15 48
        System.out.println(createTime());
    }
}
