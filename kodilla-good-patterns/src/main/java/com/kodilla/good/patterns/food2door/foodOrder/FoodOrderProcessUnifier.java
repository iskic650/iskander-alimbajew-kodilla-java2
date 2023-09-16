package com.kodilla.good.patterns.food2door.foodOrder;

import com.kodilla.good.patterns.food2door.informationService.F2DInformationService;
import com.kodilla.good.patterns.food2door.supliers.SuplierOrderDto;
import com.kodilla.good.patterns.food2door.supliers.SuplierPaymentConfirmation;

import java.util.Objects;

public class FoodOrderProcessUnifier {
    private FoodOrderService foodOrderService;
    private F2DInformationService f2DInformationService;

    public FoodOrderProcessUnifier(final FoodOrderService foodOrderService, final F2DInformationService f2DInformationService) {
        this.foodOrderService = foodOrderService;
        this.f2DInformationService = f2DInformationService;
    }

    public FoodOrderDto orderProcessReciever(SuplierPaymentConfirmation suplierPaymentConfirmation, SuplierOrderDto suplierOrderDto) {
        boolean orderConfirmation = suplierPaymentConfirmation.process().getConfirm();

        if(orderConfirmation && (Objects.equals(suplierOrderDto.getSuplierName(), suplierPaymentConfirmation.getSuplierName()))) {
            return new FoodOrderDto(new SuplierOrderDto(suplierOrderDto.getSuplierName(), suplierOrderDto.getProductId(), suplierOrderDto.getProductQuantity()));
        } else {
            return new FoodOrderDto(new SuplierOrderDto("Order canceled", 0, 0));
        }
    }

    public void process(FoodOrderDto foodOrderDto) {
        if(foodOrderDto.getSuplierName() != "Order canceled") {
            f2DInformationService.informOfOrderApproval();
            System.out.println("Delivery in progress");
        } else {
            f2DInformationService.informOfOrderCancelment();
            System.out.println("Delivery canceled");
        }

    }
}
