package org.yi.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.yi.Main;

import java.util.Arrays;

@EqualsAndHashCode                      // remove ToString to be able to initilaize combos
@Getter
@Setter

public class RestaurantManagementSystem {
    private static final int MAX_COMBO_NUM = 20;        //max combos is 20
    private int comboNum = 0;           //have 0 combos at the beginning;Starts with 0 -> 20
    private Combo[] combos;             //array for Combo

    public RestaurantManagementSystem(){
        this.combos = new Combo[MAX_COMBO_NUM];                     // Has maximum of 20 combos; cant change(MAX_COMBO_NUM)
    }
    public void addCombo(Combo combo) {
        if (comboNum < MAX_COMBO_NUM) {
            //Add the combo
            combos[comboNum] = combo;
        }else{
            //Reach the cap
            System.out.printf("There are %d combos already.Add combo failed.", MAX_COMBO_NUM);
        }
    }

    @Override
    public String toString() {
        String combosStr = "[";
        for (Combo combo : combos) {
            if (combo != null) {
                combosStr += combo + ", ";              //Adds the string
            }
        }
        combosStr += "]";
        return "RestaurantManagementSystem{" +
                "combos=" + combosStr +
                '}';
    }
}
