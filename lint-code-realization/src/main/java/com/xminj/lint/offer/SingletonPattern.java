package com.xminj.lint.offer;

/**
 * Singleton is a most widely used design pattern.
 * If a class has and only has one instance at every moment, we call this design as singleton. For example,
 * for class Mouse (not a animal mouse), we should design it in singleton.
 * <p>
 * You job is to implement a getInstance method for given class, return the same instance of this class every time you call this method.
 * <p>
 * If we call getInstance concurrently, can you make sure your code could run correctly?
 */
public class SingletonPattern {
    /**
     * 懒汉模式
     */
    private static SingletonPattern pattern = null;
    private SingletonPattern(){}
    public static SingletonPattern getInstance(){
        if (pattern ==null){
            pattern = new SingletonPattern();
        }
        return pattern;
    }

    /**
     * 其他的设计方式
     * https://github.com/iluwatar/java-design-patterns/blob/master/singleton/src/main/java/com/iluwatar/singleton/ThreadSafeDoubleCheckLocking.java
     * https://github.com/iluwatar/java-design-patterns/blob/master/singleton/src/main/java/com/iluwatar/singleton/ThreadSafeLazyLoadedIvoryTower.java
     */
}
