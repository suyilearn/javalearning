package com.sunying.learning.java.base.generics;

/**
 * Created by SunYing on 2017/6/14.
 */
public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new Jonathan();
        try {
            fruits[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            fruits[0] = new Orange();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}


class Fruit {

}


class Apple extends Fruit {

}


class Jonathan extends Apple {

}


class Orange extends Fruit {

}


