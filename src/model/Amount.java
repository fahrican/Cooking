package model;

public class Amount {

    private float quantity;
    private String unit;

    public Amount(float quantity, String unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }
}
