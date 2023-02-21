package com.javarush.task.task13.task1327;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;

public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person person){
        System.out.println(this.name + " за " + person.getNamePadezh());
    }
}
