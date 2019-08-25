package com.gupaotask.pattern.prototype.deep;

import java.util.ArrayList;

public class deepTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeB prototypeB=new PrototypeB();
        prototypeB.setName("ming");
        prototypeB.setAge(100);
        prototypeB.setFriends(new ArrayList<String>());

        PrototypeB prototypeBClone=(PrototypeB)prototypeB.clone();
        System.out.println("克隆对象中的引用类型地址值：" + prototypeBClone.getFriends());
        System.out.println("原对象中的引用类型地址值：" + prototypeB.getFriends());
        System.out.println("对象地址比较："+(prototypeBClone.getFriends() == prototypeB.getFriends()));

    }
}
