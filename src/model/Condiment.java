package model;

public abstract class Condiment {

    private Amount amount;
    private String description;
    private int energy;
    private String condimentName = this.getClass().getSimpleName();


    public Condiment(Amount amount, String description, int energy) {
        this.amount = amount;
        this.description = description;
        this.energy = energy;
    }

    public Amount getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public int getEnergy() {
        return energy;
    }

    public String getCondimentName() {
        return condimentName;
    }

    @Override
    public String toString() {
        return String.format("Condiment name: " + this.getCondimentName() + ", Amount: " + this.getAmount().getQuantity()
                + ", Description: " + this.getDescription()
                + ", Energy Level: " + this.getEnergy());
    }
}
