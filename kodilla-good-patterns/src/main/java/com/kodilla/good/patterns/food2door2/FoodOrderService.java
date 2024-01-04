package com.kodilla.good.patterns.food2door2;

import java.util.Objects;

public class FoodOrderService {

    public void processUnifier(Cart cart) {
        String suplierName = cart.suplierName();
        Suplier suplier = null;
        if(Objects.equals(suplierName, "HealthyFood")){
            suplier = new HealthyFood();
        }if(Objects.equals(suplierName, "ExtraFood")) {
            suplier = new ExtraFood();
        }if(Objects.equals(suplierName, "GlutenFreeFood")) {
            suplier = new GlutenFreeFood();
        }

        try {
            assert suplier != null;
            suplier.process(cart.product(), cart.quantity());
        } catch(NullPointerException ignored){
        }
    }
}
