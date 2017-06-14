package com.sunying.learning.java.base.constructor;

/**
 * Created by SunYing on 2017/6/14.
 */
public class FatherClass {
    protected static int count = 10;
    private String name;

    static {
        System.out.println("父类的静态属性count初始化:" + count);
    }

    public FatherClass() {
        System.out.println("执行了父类的无参构造方法");
    }

    public FatherClass(String name) {
        System.out.println("执行了父类的构造方法FatherClass(String name)" + name);
    }
}
