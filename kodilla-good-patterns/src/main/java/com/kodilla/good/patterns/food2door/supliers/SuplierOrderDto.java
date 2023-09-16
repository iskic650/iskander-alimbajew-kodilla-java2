package com.kodilla.good.patterns.food2door.supliers;

public class SuplierOrderDto implements OrderDto{
    private final String suplierName;
    private final int productId;
    private final int productQuantity;

    public SuplierOrderDto(final String suplierName, final int productId, final int productQuantity) {
        this.suplierName = suplierName;
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public String getSuplierName() {
        return suplierName;
    }

    public int getProductId() {
        return productId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
