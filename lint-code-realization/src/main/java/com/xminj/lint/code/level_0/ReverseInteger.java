package com.xminj.lint.code.level_0;

import java.util.Random;

/**
 * Reverse a 3-digit integer.
 * 反转一个三位数
 * Example 1:
 *      Input: number=123
 *      Output:number=321
 * Example 2:
 *      Input: number=900
 *      Output:number=9
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int cunt = args.length > 0 ? Integer.parseInt(args[0]) : 20;
        long timeTotal = 0;
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < cunt; i++) {
            int number = random.nextInt(900) + 100;
            System.out.println(reverseIntegerSecond(number));
        }
        timeTotal = System.currentTimeMillis() - startTime;
        System.out.printf("%d次总耗时：%d，平均耗时:%d\n", cunt, timeTotal, timeTotal / cunt);
    }

    /**
     * 第一中实现,分别计算 个位、十位、百位，在反转
     * lintCode提交之后测试总耗时：170ms
     * 自己测：10000000次总耗时：317，平均耗时：
     */
    private static Integer reverseIntegerFirst(Integer number) {
        /*int hundredPlace = number / 100; // 百位
        int tenPlace = (number % 100) / 10;
        int onesPlace = (number % 100) % 10;*/
        //System.out.printf("百位：%d,十位：%d,个位：%d\n", hundredPlace, tenPlace, onesPlace);
        /*if (onesPlace == 0) {
            if (tenPlace == 0) {
                return hundredPlace;
            }
            return tenPlace * 10 + hundredPlace;
        }*/
        return ((number % 100) % 10) * 100 + ((number % 100) / 10) * 10 + (number / 100);
    }


    /**
     * 利用字符操作反转，比较耗时
     * lintCode提交之后测试总耗时：202ms
     */
    private static Integer reverseIntegerSecond(Integer number) {
        System.out.printf("原始数据：%d\n", number);
        char[] bytes = String.valueOf(number).toCharArray();
        char t = bytes[2];
        bytes[2] = bytes[0];
        bytes[0] = t;
        return Integer.parseInt(String.valueOf(bytes));
    }
}
