package com.abhi.practice.service;

import com.abhi.practice.model.Address;

public class HelloService {
    private String name;
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello "+name+" from "+address.getCity().getName());
    }
}
