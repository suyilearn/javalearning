package com.sunying.learning.java.base.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/15.
 */

public class LostInformation {
    public static void main(String[] args) {
        List<Freb> list = new ArrayList<Freb>();
        Map<Freb, Fnorkle> map = new HashMap<Freb, Fnorkle>();
        Quark<Fnorkle> quark = new Quark<Fnorkle>();
        Particle<Long, Double> p = new Particle<Long, Double>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
    }
}

class Freb {

}
class Fnorkle {

}

class Quark<Q> {

}

class Particle<POSITION, MOMENTUM> {

}
/* Output:
[E]
[K, V]
[Q]
[POSITION, MOMENTUM]
*///:~
