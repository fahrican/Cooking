package app;

import administration.RecipeAdministration;
import model.Amount;
import model.Beef;
import model.Falafel;
import model.OrientDish;

public class App {

    public static void main(String[] args) {

        Beef kebab = new Beef(new Amount(2, "Kebap"), "Kebap", 4);
        Falafel falafel = new Falafel(new Amount(6, "Falafel balls"), "Falafel", 6);
        OrientDish mixPlate = new OrientDish("Kebab with Falafel", "beef skewer with Falafel balls");

        mixPlate.condiments.add(kebab);
        mixPlate.condiments.add(falafel);
        mixPlate.listAllCondiments();
        mixPlate.getEnergyLevel();
        RecipeAdministration administration = new RecipeAdministration();
        administration.recipes.add(mixPlate);
        administration.listAllRecipes();
    }
}
