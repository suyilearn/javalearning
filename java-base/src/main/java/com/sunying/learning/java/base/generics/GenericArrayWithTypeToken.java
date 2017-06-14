package com.sunying.learning.java.base.generics;

import java.lang.reflect.Array;

/**
 * Created by SunYing on 2017/6/14.
 */

//这里不能删除T类型的标识,因为下面需要用到这个
public class GenericArrayWithTypeToken<T> {
    private T[] array;

    public GenericArrayWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> integerGenericArrayWithTypeToken = new GenericArrayWithTypeToken<>(Integer.class, 10);
        Integer[] rep = integerGenericArrayWithTypeToken.rep();
    }

}
