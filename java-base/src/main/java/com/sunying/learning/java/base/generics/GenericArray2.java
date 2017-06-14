package com.sunying.learning.java.base.generics;

/**
 * Created by SunYing on 2017/6/14.
 */
public class GenericArray2<T> {
    private Object[] array;

    public GenericArray2(int sz) {
        array = new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public T[] rep() {
        return (T[]) array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> integerGenericArray2 = new GenericArray2<>(10);
        for (int i = 0; i < 10; i++) {
            integerGenericArray2.put(i, i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(integerGenericArray2.get(i));
        }
        try {
            Integer[] rep = integerGenericArray2.rep();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
