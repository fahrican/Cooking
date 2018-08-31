package model;

import helper.IBoilable;

public class Beef extends Condiment implements IBoilable {

    public Beef(Amount amount, String description, int energy) {
        super(amount, description, energy);
    }

    @Override
    public void boil() {
        System.out.println("The condiment " + this.getCondimentName() + " needs "
                + IBoilable.boilingDuration + " in " + IBoilable.boilingTempearure
                + " celsius.");
    }
}
