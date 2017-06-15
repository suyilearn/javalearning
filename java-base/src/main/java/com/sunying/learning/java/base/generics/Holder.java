package com.sunying.learning.java.base.generics;

/**
 * Created by SunYing on 2017/6/15.
 */
public class Holder<T> {
    private T value;

    public Holder() {

    }

    public Holder(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<>(new Apple());
        Apple d = appleHolder.getValue();
        appleHolder.setValue(d);
        //        Holder<Fruit> fruitHolder = appleHolder;
        Holder<? extends Fruit> fruitHolder0 = new Holder<Apple>();
        Holder<? extends Fruit> fruitHolder1 = appleHolder;
        Holder<? super Fruit> fruitHolder2 = new Holder<>();
        Holder<? super Apple> fruitHolder4 = new Holder<Fruit>();
        Holder<Fruit> fruitHolder3 = new Holder<>();
        Fruit fruit = fruitHolder1.getValue();
        Apple apple = (Apple) fruitHolder1.getValue();
        try {
            Orange orange = (Orange) fruitHolder1.getValue();
        } catch (Exception e) {
            System.out.println(e);
        }

        fruitHolder2.setValue(new Apple());
        Object valu2 = fruitHolder2.getValue();
        //        fruitHolder1.setValue(new Apple());
        Object value4 = fruitHolder4.getValue();
        fruitHolder3.setValue(new Apple());
        Fruit value3 = fruitHolder3.getValue();
        //        fruitHolder.setValue(new Orange());
        //        fruitHolder.setValue(new Fruit());
        System.out.println(fruitHolder1.equals(apple));
    }
}

/**
 * 请记住PECS原则：生产者（Producer）使用extends，消费者（Consumer）使用super。
 * 生产者使用extends
 * 如果你需要一个列表提供T类型的元素（即你想从列表中读取T类型的元素），你需要把这个列表声明成< extends T>，比如List< extends Integer>，因此你不能往该列表中添加任何元素。
 * 消费者使用super
 * 如果需要一个列表使用T类型的元素（即你想把T类型的元素加入到列表中），你需要把这个列表声明成< super T>，比如List< super Integer>，因此你不能保证从中读取到的元素的类型。
 * 即是生产者，也是消费者
 * 如果一个列表即要生产，又要消费，你不能使用泛型通配符声明列表，比如List<Integer>。
 */
