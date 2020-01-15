package com.xminj.lint.code.level_0;

/**
 * Implement a Rectangle class which include the following attributes and methods:
 * <p>
 * 1.Two public attributes width and height.
 * 2.A constructor which expects two parameters width and height of type int.
 * 3.A method getArea which would calculate the size of the rectangle and return.
 * <p>
 * 实现一个矩阵类Rectangle，包含如下的一些成员变量与函数：
 * <p>
 * 1.两个共有的成员变量 width 和 height 分别代表宽度和高度。
 * 2.一个构造函数，接受2个参数 width 和 height 来设定矩阵的宽度和高度。
 * 3.一个成员函数 getArea，返回这个矩阵的面积。
 * <p>
 * Example1:
 * Java:
 *  Rectangle rec = new Rectangle(3, 4);
 *  rec.getArea(); // should get 12，3*4=12
 * Example2:
 * Java:
 *  Rectangle rec = new Rectangle(4, 4);
 *  rec.getArea(); // should get 16，4*4=16
 */
public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {

    }
}
