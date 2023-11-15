package org.yi;

import org.yi.dto.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem  restaurantManagementSystem = new RestaurantManagementSystem();
        Dish fries = new Dish("Fish Filet", 2.99, FoodType.VEGE);
        Beverage coke = new Beverage("Coca cola", 0.99, false);
        Combo cokeAndFries = new Combo("Coke & Fish");
        cokeAndFries.addDish(fries);
        cokeAndFries.addBeverage(coke);
        restaurantManagementSystem.addCombo(cokeAndFries);

        System.out.println(restaurantManagementSystem);
    }
}