package com.sunying.learning.java.base.generics;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SunYing on 2017/6/14.
 */
public class ClassTypeCapture<T> {
    Class<T> kind;
    Map<String, Class<?>> types = new HashMap<>();

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> buildingClassTypeCapture = new ClassTypeCapture<>(Building.class);
        System.out.println(buildingClassTypeCapture.f(new Building()));
        System.out.println(buildingClassTypeCapture.f(new House()));
        ClassTypeCapture<House> houseClassTypeCapture = new ClassTypeCapture<>(House.class);
        System.out.println(houseClassTypeCapture.f(new Building()));
        System.out.println(houseClassTypeCapture.f(new House()));

    }
}


class Building {

}


class House extends Building {

}
