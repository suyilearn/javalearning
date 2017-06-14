package com.sunying.learning.java.base.datatype;

/**
 * Created by SunYing on 2017/6/14.
 */
public class NumberEquation {
    public static void main(String[] args) {
        Integer i = 42;
        Long l = 42l;
        Double d = 42.0;

        System.out.println(i.equals(d));
        System.out.println(d.equals(l));
        System.out.println(i.equals(l));
        System.out.println(l.equals(42L));
    }
}
