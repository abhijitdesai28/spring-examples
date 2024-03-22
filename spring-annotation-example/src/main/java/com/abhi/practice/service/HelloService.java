package com.abhi.practice.service;

import com.abhi.practice.model.Address;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service()
public class HelloService {
    private String name;
    private Address address;
    public void sayHello()
    {
        System.out.println("hello "+name+" from "+address.getCity().getName());
    }
}
