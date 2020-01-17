package com.xminj.lint.code.level_1;

/**
 * Write an algorithm which computes the number of trailing zeros in n factorial.
 * 设计一个算法，计算出n阶乘中尾部零的个数
 * Example 1:
 *      Input:11
 *      Output:2
 */
public class FactorialZeros {

    /**
     * 2! = 2*1 = 2
     * 3! = 3*2*1 = 6
     * 4! = 4*3*2*1 = 24
     * 5! = 5*4*3*2*1 = 120
     * 6! = 6*5*4*3*2*1 = 720
     *          .
     *          .
     *          .
     * 9! = 9*8*7*6*5*4*3*2*1 = 362880
     * 10! = 10*9*8*7*6*5*4*3*2*1 = 3628800
     * 11! = 11*10*9*8*7*6*5*4*3*2*1 = 39916800‬
     * 15! = 15*14*13*12*11*10*9*8*7*6*5*4*3*2*1 = 1307674368000
     * 20! = 2,432,902,008,176,640,000
     * 25! = 15,511,210,043,330,985,984,000,000
     * 30! =
     */
    private static long factorialZeros(long n){
        long count = 0;
        while (n>=5){
            count += (n=n/5);
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(factorialZeros(15));
    }
}
