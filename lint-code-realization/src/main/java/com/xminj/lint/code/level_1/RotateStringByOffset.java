package com.xminj.lint.code.level_1;

/**
 * Given a string(Given in the way of char array) and an offset,
 * rotate the string by offset in place. (rotate from left to right).
 * 给定一个字符串（以字符数组的形式给出）和一个偏移量，根据偏移量原地旋转字符串(从左向右旋转)。
 * in place:意味着你要在s本身进行修改。你不需要返回任何东西。
 * Example 1:
 * Input: str="abcdefg", offset = 3
 * Output: str = "efgabcd"
 * Example 2:
 * Input: str="abcdefg", offset = 0
 * Output: str = "abcdefg"
 * Example 3:
 * Input: str="abcdefg", offset = 1
 * Output: str = "gabcdef"
 * Example 4:
 * Input: str="abcdefg", offset =2
 * Output: str = "fgabcde"
 * Example 5:
 * Input: str="abcdefg", offset = 10
 * Output: str = "efgabcd"
 */
public class RotateStringByOffset {

    private static void  rotateString(char[] str, int offset) {
        String s = String.valueOf(str);
        if (s.equals("")&&s==null){
            return;
        }
        offset = offset>str.length?offset%str.length:offset;
        for (int i = 0; i < offset; i++) { //
            char temp = str[str.length-1]; // 将最后一位数保留下来
            for (int j = str.length - 1; j > 0; j--) {
                str[j] = str[j-1];
            }
            str[0]=temp;
        }
    }

    public static void main(String[] args) {
        String str = "abcdefg";
    }
}
