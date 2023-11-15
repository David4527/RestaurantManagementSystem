package org.yi.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Setter
@Getter
public class Combo {
    private static final int MAX_DISH_NUM = 2;
    private static final int MAX_BEVERAGE_NUM = 2;
    private static int NextId = 1;
    private String id;
    private String name;
    private double price;
    private Dish[] dishes;                     //array for Dish
    private Beverage[] beverages;               //array for Beverage

    public Combo(String name) {
        this.id = String.format("C%03d", NextId++);
        this.name = name;
        this.dishes = new Dish[2];              //contains 2 dishes
        this.beverages = new Beverage[2];       //contains 2 beverages
    }

    public void addDish(Dish dish) {
        if (dishes[0] == null) {
            dishes[0] = dish;
            calcPrice();
        } else if (dishes[1] == null) {
            dishes[1] = dish;
        } else {
            System.out.printf("There are already %d dishes, added dishes failed.", MAX_DISH_NUM);
        }
    }

    public void addBeverage(Beverage beverage) {
        if (beverages[0] == null) {
            beverages[0] = beverage;
            calcPrice();
        } else if (beverages[1] == null) {
            beverages[1] = beverage;
            calcPrice();
        } else {
            System.out.printf("There are already %d dishes, added dishes failed.", MAX_DISH_NUM);
        }
    }

    public void calcPrice() {
        double price = 0;
        for (Beverage beverage : beverages) {             //Getters from Beverage
            if (beverage != null) {
                price += beverage.getPrice();
            }
            for (Dish dish : dishes) {                          //Getters from Dish
                if (dish != null) {
                    price += dish.getPrice();
                }
                double discountRatio = 0.8;
                this.price = price * discountRatio;
            }
        }
    }
}
