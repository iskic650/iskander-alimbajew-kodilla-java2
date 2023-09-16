package com.kodilla.good.patterns.food2door.supliers;

public class SuplierPaymentConfirmation {
    private String suplierName;
    private boolean confirm;

    public SuplierPaymentConfirmation(String suplierName, boolean confirm) {
        this.suplierName = suplierName;
        this.confirm = confirm;
    }

    public String getSuplierName() {
        return suplierName;
    }

    public boolean getConfirm() {
        return confirm;
    }

    public SuplierPaymentConfirmation process() {
        return new SuplierPaymentConfirmation("EkoFood", true);
    }
}
