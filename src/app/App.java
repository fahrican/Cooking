package app;

import administration.RecipeAdministration;
import model.Amount;
import model.Beef;
import model.Falafel;
import model.OrientDish;

public class App {

    public static void main(String[] args) {

        Beef kebab = new Beef(new Amount(2, "kilogram"), "Kebap", 4);
        Falafel falafel = new Falafel(new Amount(6, "gram"), "Falafel", 6);
        Falafel teaspoon = new Falafel(new Amount(1, "teaspoon"), "Humus", 1);
        Falafel dekagram = new Falafel(new Amount(1, "dekagram"), "Humus & Co.", 1);
        OrientDish mixPlate = new OrientDish("Kebab with Falafel", "beef skewer with Falafel balls");

        mixPlate.condiments.add(kebab);
        mixPlate.condiments.add(dekagram);
        mixPlate.condiments.add(falafel);
        mixPlate.condiments.add(teaspoon);
        mixPlate.listAllCondiments();
        mixPlate.getEnergyLevel();
        RecipeAdministration administration = new RecipeAdministration();
        administration.recipes.add(mixPlate);
        administration.listAllRecipes();
    }
}
