package com.xminj.lint.offer;

/**
 * Write a method to replace all spaces in a string with %20. The string is given in a characters array,
 * you can assume it has enough space for replacement and you are given the true length of the string.
 *
 * You code should also return the new length of the string after replacement.
 */
public class ReplaceBlank {

    private static int replaceBlank(char[] str,int length){
        // 计算原字符串中有多少空格
        int spaceNum = strLength(str);
        int charLength = 3*spaceNum-spaceNum+str.length; // 修改后的长度
        char[] result = new char[charLength+1];
        int num = charLength-1;
        for (int i = str.length-1; i >= 0; i--) {
            if (' ' ==  str[i]){
                result[num--]='0';
                result[num--]='2';
                result[num--]='%';
            }else {
                result[num--]=str[i];
            }
        }
        System.out.println(String.valueOf(result));
        return charLength;
    }

    private static int strLength(char[] str) {
        int length = 0;
        for (int i = 0; i < str.length; i++) {
            if (' '==str[i]){
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        char[] str = new char[]{'M','r',' ','J','o','h','n',' ','S','m','i','t','h'};
        System.out.println(replaceBlank(str,str.length));
    }
}
