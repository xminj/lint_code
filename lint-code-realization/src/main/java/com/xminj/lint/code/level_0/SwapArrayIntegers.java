package com.xminj.lint.code.level_0;

/**
 * Given an array and two indexes, swap the integers on the two indices.
 * 给你一个数组和两个索引，交换下标为这两个索引的数字
 * Example 1:
 *      Input: `[1,2,3,4]` and index1 = `2`, index2 = `3`
 *      Output:The array will change to `[1,2,4,3]` after swapping. You don't need return anything, just swap the integers in-place.
 * Example 2:
 *      Input: `[1,2,2,2]` and index1 = `0`, index2 = `3`
 *      Output:The array will change to `[2,2,2,1]` after swapping. You don't need return anything, just swap the integers in-place.
 */
public class SwapArrayIntegers {

    private static void swapIntegers(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =temp;
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }

    public static void main(String[] args) {

    }
}
