package com.sunying.learning.java.base.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by SunYing on 2017/6/14.
 *
 * 对于泛型中创建数组,使用Array.newInstance()是推荐的方式
 *
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringArrayMaker = new ArrayMaker<>(String.class);
        ArrayMaker<Integer> integerArrayMaker = new ArrayMaker<>(Integer.class);
        String[] stringArray = stringArrayMaker.create(9);
        Integer[] intArray = integerArrayMaker.create(7);
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(intArray));
    }

}

/* Output:
[null, null, null, null, null, null, null, null, null]
*///:~

