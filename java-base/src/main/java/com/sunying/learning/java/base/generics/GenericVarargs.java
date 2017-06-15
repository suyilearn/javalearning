package com.sunying.learning.java.base.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SunYing on 2017/6/14.
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        //有个什么样的返回值一定会有个这样的变量来接收
        List<T> result = new ArrayList<T>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}
