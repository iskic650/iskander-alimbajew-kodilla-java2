package com.kodilla.good.patterns.food2door.foodOrder;

import com.kodilla.good.patterns.food2door.supliers.SuplierOrderDto;

import java.util.ArrayList;
import java.util.List;

public class FoodOrderDto {
    private String suplierName;
    private List<FoodProduct> order;

    public FoodOrderDto(SuplierOrderDto suplierOrderDto) {
        this.suplierName = suplierOrderDto.getSuplierName();
        List<FoodProduct> l = new ArrayList<>();
        for(int i = 0; i< suplierOrderDto.getProductQuantity(); i++) {
            l.add(new FoodProduct(suplierOrderDto.getProductId()));
        }

    }

    public String getSuplierName() {
        return suplierName;
    }

    public List<FoodProduct> getOrder() {
        return order;
    }
}
