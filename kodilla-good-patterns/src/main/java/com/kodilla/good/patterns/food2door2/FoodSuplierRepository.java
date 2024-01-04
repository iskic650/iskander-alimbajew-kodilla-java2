package com.kodilla.good.patterns.food2door2;

import java.util.HashMap;
import java.util.Map;

public class FoodSuplierRepository {
    private final Map<String, String> listOfSupliers;

    public FoodSuplierRepository() {
        this.listOfSupliers = new HashMap<>() {{
            put("ExtraFood", "f@food.com");
            put("HealthyFood", "hf@food.com");
            put("GlutenFreeFood", "gff@food.com");
        }};
    }

    public String getSuplierMail(String suplierName){
        return listOfSupliers.get(suplierName);
    }
}
