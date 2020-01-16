package com.xminj.lint.code.level_0;

/**
 * Given an integer array, sort it in ascending order. Use selection sort, bubble sort, insertion sort or any O(n2) algorithm.
 * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
 * Example 1:
 * Input:  [3, 2, 1, 4, 5]
 * Output: [1, 2, 3, 4, 5]
 */
public class SortInteger {

    /**
     * 快速排序实现思路：
     * https://en.wikipedia.org/wiki/Selection_sort
     * 第一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，
     * 然后再从剩余的未排序元素中寻找到最小（大）元素，然后放到已排序的序列的末尾。
     * 以此类推，直到全部待排序的数据元素的个数为零。选择排序是不稳定的排序方法。
     */
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 冒泡排序 https://en.wikipedia.org/wiki/Bubble_sort
     * 它重复地走访过要排序的元素列，依次比较两个相邻的元素，如果顺序（如从大到小、首字母从从Z到A）错误就把他们交换过来。
     * 走访元素的工作是重复地进行直到没有相邻元素需要交换，也就是说该元素列已经排序完成
     */
    private static void bubbleSortFirst(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // 循环次数
            for (int j = 0; j < arr.length - 1; j++) { // 4
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 冒泡排序优化版
     * 针对问题
     * 数据的顺序排好之后，冒泡算法仍然会继续进行下一轮的比较，直到arr.length-1次，后面的比较没有意义的
     * 方案
     * 设置标志位flag，如果发生了交换flag设置为true；如果没有交换就设置为false。
     * 这样当一轮比较结束后如果flag仍为false，即：这一轮没有发生交换，说明数据的顺序已经排好，没有必要继续进行下去。
     */
    private static void bubbleSortSecond(int[] arr) {
        // 临时变量
        int tmp;
        //是否有交换的标志
        boolean flag;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {// 表示循环次数，一共arr.length-1次
            flag = false; // 每次遍历标志位都要先置为false，才能判断后面的元素是否发生了交换
            /**
             * 这层for循环会随着i的增大，循环次数减少
             */
            for (int j = arr.length - 1; j > i; j--) { //选出该趟排序的最大值往后移动
                if (arr[j] < arr[j - 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                    flag = true; //只要有发生了交换，flag就置为true
                }
            }
            count++;
            // 判断标志位是否为false，如果为false，说明后面的元素已经有序，跳出本次循环
            if (!flag) break;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("循环次数：" + count);
    }

    private static void bubbleSortThird(int[] arr) {
        // 临时变量
        int tmp;
        //是否有交换的标志
        boolean flag;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {// 表示循环次数，一共arr.length-1次
            flag = false; // 每次遍历标志位都要先置为false，才能判断后面的元素是否发生了交换
            /**
             * 这一层的for循环的次数是固定的，每次都是arr.length-1次
             */
            for (int j = 0; j < arr.length-1; j++) { //选出该趟排序的最大值往后移动
                if (arr[j] < arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true; //只要有发生了交换，flag就置为true
                }
            }
            count++;
            // 判断标志位是否为false，如果为false，说明后面的元素已经有序，跳出本次循环
            if (!flag) break;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("循环次数：" + count);
    }


    /**
     * 插入排序：https://en.wikipedia.org/wiki/Insertion_sort
     *      插入排序（Insertion sort）是一种简单直观且稳定的排序算法
     *      插入排序的基本思想是：每步将一个待排序的记录，按其关键码值的大小插入前面已经排序的文件中适当位置上，直到全部插入完为止。
     * 直接插入排序
     *      直接插入排序是一种简单的插入排序法，其基本思想是：把待排序的记录按其关键码值的大小逐个插入到一个已经排好序的有序序列中，
     *      直到所有的记录插入完为止，得到一个新的有序序列
     *  折半插入排序（二分插入排序）
     *      折半插入排序的算法思想：
     *          1、计算 0 ~ i-1 的中间点，用 i 索引处的元素与中间值进行比较，如果 i 索引处的元素大，说明要插入的这个元素应该在中间值和刚加入i索引之间，
     *          反之，就是在刚开始的位置 到中间值的位置，这样很简单的完成了折半；
     *          2、在相应的半个范围里面找插入的位置时，不断的用（1）步骤缩小范围，不停的折半，
     *          范围依次缩小为 1/2 1/4 1/8 .......快速的确定出第 i 个元素要插在什么地方；
     *          3、确定位置之后，将整个序列后移，并将元素插入到相应位置。
     */
    private static void insertionSortFirst(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else {break;}
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void insertionSortSecond(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = 0;
            for (int j = i; j > 0 ; j--) {
                if (arr[j] < arr[j-1]) {
                    arr[j] = arr[j-1];
                    index = j-1;
                }else {break;}
                arr[index] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        insertionSortSecond(arr);
    }
}
