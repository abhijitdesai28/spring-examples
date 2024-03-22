package com.abhi.practice.model;

import lombok.*;

import java.nio.file.Path;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Address {
    private City city;
}
