package com.xminj.lint.code.level_1;

/**
 * Write a function that add two numbers A and B.
 * 给出两个整数 aa 和 bb , 求他们的和。
 *  位运算
 */
public class AddNumbersOrBit {

    public static void main(String[] args) {
        /**
         * 二进制数
         *  a=3:    0000 0011
         *  b=6:    0000 0110
         *  运算符  ^
         *         -------------
         *          0000 0101       = 5
         *         &
         *         --------------
         *          0000 0010       = 2
         *         |
         *         --------------
         *          0000 0111       = 7
         *     ^ <<
         *         -------------
         *          0000 1010       = 10
         *
         */


        int a = 3,b=6;
        System.out.println(aplusb(a,b));
    }

    private static int aplusb(int a, int b) {
        if (b == 0)return a;
        int sum = a ^ b; // 没有进位的加法运算
        int carry = (a&b) << 1; //进位，左移运算。
        return aplusb(sum,carry);
    }
}
