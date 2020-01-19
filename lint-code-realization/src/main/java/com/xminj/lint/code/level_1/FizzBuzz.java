package com.xminj.lint.code.level_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Given number n. Print number from 1 to n. But:
 *  1、when number is divided by 3, print "fizz".
 *  2、when number is divided by 5, print "buzz".
 *  3、when number is divided by both 3 and 5, print "fizz buzz".
 *  4、when number can't be divided by either 3 or 5, print the number itself.
 *
 *
 * 给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
 *  1、如果这个数被3整除，打印fizz.
 *  2、如果这个数被5整除，打印buzz.
 *  3、如果这个数能同时被3和5整除，打印fizz buzz.
 *  4、如果这个数既不能被 3 整除也不能被 5 整除，打印数字本身。
 *
 * If n = 15, you should return:
 * [
 *   "1", "2", "fizz",
 *   "4", "buzz", "fizz",
 *   "7", "8", "fizz",
 *   "buzz", "11", "fizz",
 *   "13", "14", "fizz buzz"
 * ]
 * If n = 10, you should return:
 * [
 *   "1", "2", "fizz",
 *   "4", "buzz", "fizz",
 *   "7", "8", "fizz",
 *   "buzz"
 * ]
 *
 * 只用一个 if 来实现
 */
public class FizzBuzz {

    private static List<String> fizzBuzz(int num){
        List<String> str = new ArrayList<>();
        for (int i = 1; i <= num ; i++) {
            str.add(i%3==0&&i%5==0 ? "fizz buzz" : (i%3==0 ? "fizz":(i%5==0 ? "buzz": String.valueOf(i))));
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15).toString());
    }
}
