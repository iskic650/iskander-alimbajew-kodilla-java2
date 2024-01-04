package com.kodilla.good.patterns.food2door2;

public class Food2DoorApplication {
    public static void main(String[] args){
        Cart cart = new Cart("HealthyFood", "cheese", 2);
        FoodOrderService foodOrderService = new FoodOrderService();
        foodOrderService.processUnifier(cart);

        InformationService informationService = new InformationService();
        informationService.sendOrderedCart(cart);
        informationService.sendOrderShippingConfirmation(cart);
    }
}
