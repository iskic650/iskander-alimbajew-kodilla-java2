package com.kodilla.good.patterns.food2door2;

public class InformationService {
    void sendOrderedCart(Cart cart){
        FoodSuplierRepository foodSuplierRepository = new FoodSuplierRepository();
        String mail = foodSuplierRepository.getSuplierMail(cart.suplierName());
        System.out.println("Sending order to: " + mail);
        System.out.println("Welcone " + cart.suplierName() + ". The order is: "
        + cart.product() + " x" + cart.quantity());
    }

    void sendOrderShippingConfirmation(Cart cart){
        FoodSuplierRepository foodSuplierRepository = new FoodSuplierRepository();
        String mail = foodSuplierRepository.getSuplierMail(cart.suplierName());
        System.out.println("Sending Shipping confirmation to: " + mail);
        System.out.println("Shipping has been confirmed.");
    }
}
