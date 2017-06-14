package com.sunying.learning.java.base.generics;

/**
 * Created by SunYing on 2017/6/14.
 */
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}


interface FactoryI<T> {
    T create();
}


class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}


class IntegerFactory implements FactoryI<Integer> {

    @Override public Integer create() {
        return 0;
    }
}


class Widget {
    public static class Factory implements FactoryI<Widget> {

        @Override public Widget create() {
            return new Widget();
        }
    }

}