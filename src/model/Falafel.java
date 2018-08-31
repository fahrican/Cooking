package model;

import helper.IFryable;

public class Falafel extends Condiment implements IFryable {

    public Falafel(Amount amount, String description, int energy) {
        super(amount, description, energy);
    }

    @Override
    public void fry() {
        System.out.println("The condiment " + this.getCondimentName() + " needs "
                + IFryable.fryingDuration + " in " + IFryable.fryingTemperature
                + " celsius.");
    }
}
