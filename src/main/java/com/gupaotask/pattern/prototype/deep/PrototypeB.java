package com.gupaotask.pattern.prototype.deep;

import java.io.*;
import java.util.List;

//深克隆
public class PrototypeB implements Cloneable, Serializable {

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

    public Object clone()throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            PrototypeB copy = (PrototypeB)ois.readObject();
            return copy;
        }catch (Exception e){
            return null;
        }


    }

}
