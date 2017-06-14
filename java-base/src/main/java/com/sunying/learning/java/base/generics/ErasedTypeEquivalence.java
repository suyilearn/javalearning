package com.sunying.learning.java.base.generics;

import java.util.ArrayList;

/**
 * Created by SunYing on 2017/6/14.
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class<? extends ArrayList> c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        Class c3 = ArrayList.class;
        System.out.println(c1 == c3);
        System.out.println(c1 == c2);
    }
}
