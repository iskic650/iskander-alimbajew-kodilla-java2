package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.foodOrder.FoodOrderProcessUnifier;
import com.kodilla.good.patterns.food2door.foodOrder.FoodOrderService;
import com.kodilla.good.patterns.food2door.informationService.F2DInformationService;
import com.kodilla.good.patterns.food2door.supliers.SuplierOrderDto;
import com.kodilla.good.patterns.food2door.supliers.SuplierPaymentConfirmation;

public class Food2DoorApllication {
    public static void main(String[] args) {
        SuplierOrderDto suplierOrderDto = new SuplierOrderDto("suplierName", 1, 7);
        FoodOrderProcessUnifier foodOrderProcessUnifier = new FoodOrderProcessUnifier(new FoodOrderService(), new F2DInformationService());
        foodOrderProcessUnifier.process(foodOrderProcessUnifier.orderProcessReceiver(new SuplierPaymentConfirmation("suplierName", true), suplierOrderDto));
    }
}
