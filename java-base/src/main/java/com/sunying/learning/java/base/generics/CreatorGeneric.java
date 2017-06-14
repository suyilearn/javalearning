package com.sunying.learning.java.base.generics;

/**
 * Created by SunYing on 2017/6/14.
 */
public class CreatorGeneric {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.f();
    }
}


abstract class GenericWithCreate<T> {
    final T element;

    GenericWithCreate(){
        element = create();
    }
    abstract T create();
}


class X {
}


class Creator extends GenericWithCreate<X> {

    @Override X create() {
        return new X();
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
