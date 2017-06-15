package com.sunying.learning.java.base.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SunYing on 2017/6/14.
 */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<>();
//        flist.add(new Apple());
//        flist.add(new Fruit());
        flist.add(null);
        Fruit fruit = flist.get(0);
    }

}
