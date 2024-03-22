package com.abhi.practice.model;

public class Address {
    private City city;
   /* public void setCity(City city) {
        this.city = city;
    }*/

    public Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}
