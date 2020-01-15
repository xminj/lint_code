package com.xminj.lint.code.level_0;

import java.util.Arrays;

/**
 * Find the Nth number in Fibonacci sequence.
 * 查找斐波纳契数列中第 N 个数。
 * Example 1:
 *      Input: 1
 *      Output:0
 * Example 2:
 *      Input: 2
 *      Output:1
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibonacciSequenceFirst(5));
    }

    /**
     * lint-code耗时：201 ms
     */
    private static int fibonacciSequenceFirst(int num) {
        if (num == 1) return 0;
        if (num <= 3) return 1;
        int n2 = 1, n3 = 1;
        int result = 0;
        for (int i = 4; i <= num; i++) {
            result = n2 + n3;
            n2=n3;
            n3=result;
        }
        return result;
    }

    /**
     * 先初始化前10个斐波纳契数，后面的在进行计算
     * lint-code耗时：201 ms
     * 操作更耗时
     */
    private static int fibonacciSequenceSecond(int num) {
        Integer result = null;
        if (num<=10){
            Integer[] integers = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34).toArray(new Integer[10]);
            result = integers[num-1];
        }else {
            int n9 = 21, n10 = 34;
            for (int i = 11; i <= num; i++) {
                result = n9 + n10;
                n9=n10;
                n10=result;
            }
        }
        return result;
    }

    /**
     * 和第一个操作一样，优化点：利用三目运算
     */
    private static int fibonacciSequenceThird(int num) {
        int n1=0,n2=1;
        int result = 0;
        for (int i=3;i<=num;i++){
            result = n1+n2;
            n1=n2;
            n2=result;
        }
        return num==1?n1:(num<3?1:result);
    }

}
