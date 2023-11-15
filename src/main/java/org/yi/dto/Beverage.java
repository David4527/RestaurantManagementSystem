package org.yi.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Beverage {
    private static int NextId = 1;
    private String id;
    private String name;
    private double price;
    private  boolean alcoholic;
    public Beverage (String name, double price, boolean alcoholic) {
        this.id = String.format("B%03d", NextId++);
        this.name = name;
        this.price = price;
        this.alcoholic = alcoholic;
    }
}
