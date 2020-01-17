package com.xminj.lint.code.level_1;

import java.util.Arrays;

/**
 * Merge two given sorted ascending integer array A and B into a new sorted integer array.
 * 合并两个有序升序的整数数组A和B变成一个新的数组。新数组也要有序。
 * Example 1:
 *  Input:  A=[1,2,3,4], B=[2,4,5,6]
 *  Output: [1,2,2,3,4,4,5,6]
 */
public class MergeArray {

    /**
     *  Java 现有的API操作
     *
     *  java.util.DualPivotQuicksort#sort(int[], int, int, int[], int, int) 排序算法
     */
    private static int[] mergeSortedArrayFirst(int[] a, int[] b){
        int[] arr = new int[a.length+b.length];
        System.arraycopy(a,0,arr,0,a.length);
        System.arraycopy(b,0,arr,a.length,b.length);
        Arrays.sort(arr);
        return arr;
    }

    /**
     *
     */
    private static int[] mergeSortedArraySecond(int[] a, int[] b){
        int[] arr = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length&&j<b.length){
            if (a[i]<b[j]){
                arr[k++] = a[i++];
            }else {
                arr[k++] = b[j++];
            }
        }
        if (i==a.length){
            while (j<b.length){
                arr[k++]=b[j++];
            }
        }else {
            while(i<a.length){
                arr[k++] = a[i++];
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {2,4,5,6};
        for (int i : mergeSortedArraySecond(a,b)){
            System.out.println(i);
        }
        
    }
}
