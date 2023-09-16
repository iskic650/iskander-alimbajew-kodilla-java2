package com.kodilla.good.patterns.food2door.informationService;

public class F2DInformationService implements InformationService{
    public final void informOfOrderApproval(){
        System.out.println("Order approved");
    }

    public final void informOfOrderCancelment(){
        System.out.println("Order canceled");
    }
}
