package com.gupaotask.pattern.prototype.simple;

import java.util.ArrayList;

//引用地址一样 浅克隆

public class SimpleTest {

    public static void main(String[] args) {
        PrototypeA prototypeA=new PrototypeA();
        prototypeA.setName("ming");
        prototypeA.setAge(29);
        prototypeA.setFriends(new ArrayList<String>());

        PrototypeA prototypeAClone =prototypeA.clone();
        prototypeAClone.getFriends();

        System.out.println("克隆对象中的引用类型地址值：" + prototypeAClone.getFriends());
        System.out.println("原对象中的引用类型地址值：" + prototypeA.getFriends());
        System.out.println("对象地址比较："+(prototypeAClone.getFriends() == prototypeA.getFriends()));

    }
}
