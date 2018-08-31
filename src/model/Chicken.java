package model;

import helper.IBoilable;
import helper.IFryable;

public class Chicken extends Condiment implements IBoilable, IFryable {

    public Chicken(Amount amount, String description, int energy) {
        super(amount, description, energy);
    }

    @Override
    public void boil() {

        System.out.println("The condiment " + this.getCondimentName() + " needs "
                + IBoilable.boilingDuration + " in " + IBoilable.boilingTempearure
                + " celsius.");
    }

    @Override
    public void fry() {

        System.out.println("The condiment " + this.getCondimentName() + " needs "
                + IFryable.fryingDuration + " in " + IFryable.fryingTemperature
                + " celsius.");
    }
}
