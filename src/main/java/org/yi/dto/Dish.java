package org.yi.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Dish {
    private static int NextId = 1;
    private String id;
    private String name;
    private double price;
    private  FoodType foodType;
    public Dish (String name, double price, FoodType foodType) {
        this.id = String.format("D%03d", NextId++);
        this.name = name;
        this.price = price;
        this.foodType = foodType;
    }
    //1-> 001
    //11-> 011
}
