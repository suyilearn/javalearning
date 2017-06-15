package com.sunying.learning.java.base.generics;

/**
 * Created by Administrator on 2017/6/15.
 */
public class Wildcards {
    static void rawArgs(Holder holder, Object arg) {
        holder.setValue(arg);

        holder.setValue(new Wildcards());

//        T value = holder.getValue();
        Object obj = holder.getValue();
    }


    static void unboundedArg(Holder<?> holder, Object arg) {
//        holder.setValue(arg);
//        holder.setValue(new Wildcards());
//        T value = holder.getValue();
        Object value = holder.getValue();
    }


    static <T>
    T exact1(Holder<T> holder) {
        T value = holder.getValue();
        return value;
    }

    static <T>
    T exact2(Holder<T> holder, T arg) {
        holder.setValue(arg);
        T value = holder.getValue();
        return value;
    }

    static <T>
    T wildSubtybe(Holder<? extends T> holder, T arg) {
//        holder.setValue(arg);
        T value = holder.getValue();
        return value;
    }

    static <T>
    void wildSupertype(Holder<? extends T> holder, T arg) {
//        holder.setValue(arg);
        Object obj = holder.getValue();
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Long>();
        raw = new Holder();

        Holder<Long> qualified = new Holder<>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();
        Long lng = 1L;

        rawArgs(raw, lng);
        rawArgs(qualified, lng);
        rawArgs(unbounded,lng);
        rawArgs(bounded,lng);

        unboundedArg(raw, lng);
        unboundedArg(qualified, lng);
        unboundedArg(unbounded, lng);
        unboundedArg(bounded, lng);



    }

}
