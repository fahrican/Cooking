package administration;

import helper.IBoilable;
import helper.IFryable;
import model.Condiment;

import java.util.ArrayList;
import java.util.List;

public abstract class Recipe {

    public List<Condiment> condiments;
    private String description;
    private String preparation;

    public Recipe(String description, String preparation) {
        this.description = description;
        this.preparation = preparation;
        this.condiments = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    public boolean checkIfBoilable(Condiment condiment) {

        return (condiment instanceof IBoilable) ? true : false;
    }

    public boolean fryerNeeded(Condiment condiment) {

        return (condiment instanceof IFryable) ? true : false;
    }

    public void getEnergyLevel() {

        int allEnergyLevels = 0;

        for (Condiment condiment : this.condiments) {

            allEnergyLevels += condiment.getEnergy();
        }
        System.out.println("Sum of all energy levels: " + allEnergyLevels);
    }

    public void listAllCondiments() {

        for (Condiment condiment : this.condiments) {

            System.out.println(condiment);
        }
    }
}
