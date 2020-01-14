package com.xminj.lint.code.level_0;

import java.util.*;
import java.util.stream.Stream;

/**
 * Given 3 integers, return the max of them.
 * 给三个整数，求他们中的最大值。
 * Example 1:
 *  Input：num1=1，num2=9，num3=0
 *  Output:9
 */
public class MaxInteger {
    public static void main(String[] args) {
        System.out.println(maxIntegerSecond(1, 9, 0));
    }

    /**
     * 利用集合进行排序，返回最大值
     */
    private static Integer maxIntegerFirst(Integer num1, Integer num2, Integer num3) {
        //return Arrays.asList(num1, num2, num3).stream().max(Integer::compareTo).get();
        return Stream.of(num1, num2, num3).max(Integer::compareTo).get();
    }

    /**
     * {@link Integer#compare(int x, int y)}方法
     * -1 表示 x<y
     * 1  表示 x>y
     * lint-code总耗时 174 ms
     */
    private static Integer maxIntegerSecond(int num1, int num2, int num3) {
        return Integer.compare(num1, num2) == 1 ?
                (Integer.compare(num1, num3) == 1 ? num1 : num3)
                : (Integer.compare(num2, num3) == 1 ? num2 : num3);
    }
}
