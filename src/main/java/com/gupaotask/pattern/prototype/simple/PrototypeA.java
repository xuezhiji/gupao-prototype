package com.gupaotask.pattern.prototype.simple;

import com.gupaotask.pattern.prototype.Prototype;

import java.util.List;

public class PrototypeA  implements Prototype {
    private String name;
    private int age;
    private List<String> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public PrototypeA clone() {
        PrototypeA prototypeA=new PrototypeA();
        prototypeA.setName(this.name);
        prototypeA.setAge(this.age);
        prototypeA.setFriends(this.friends);
        return prototypeA;
    }
}
