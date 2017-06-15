package com.sunying.learning.java.base.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/15.
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
//        apples.add(new Fruit());
    }

    public static void main(String[] args) {
        SuperTypeWildcards.writeTo(new ArrayList<>(Fruit));
    }
}
