package com.xminj.lint.code.level_0;

/**
 * Convert a lowercase character to uppercase.
 * 字符由小写字母转换为大写字母
 * Example 1:
 *      Input: 'a'
 *      Output:'A'
 *  Example 2:
 *      Input: 'b'
 *      Output:'B'
 */
public class LowercaseCharacterToUppercase {
    public static void main(String[] args) {
        System.out.println(lowercaseCharacterToUppercaseSecond('b'));
    }

    /**
     * 利用{@link Character#toUpperCase(char)}方法转换
     * lintCode总耗时 207 ms
     */
    private static Character lowercaseCharacterToUppercaseFirst(Character ch){
        return Character.toUpperCase(ch);
    }

    /**
     * 方法耗时比较长
     */
    private static Character lowercaseCharacterToUppercaseSecond(Character ch){
        //char value = (char) (ch-32);
        return (char) (ch-32);
    }
}
