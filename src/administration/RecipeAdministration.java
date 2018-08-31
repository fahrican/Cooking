package administration;

import java.util.ArrayList;
import java.util.List;

public class RecipeAdministration {

    public List<Recipe> recipes;

    public RecipeAdministration() {
        this.recipes = new ArrayList<>();
    }

    public void listAllRecipes(){

        for (Recipe recipe : this.recipes) {
            System.out.println("Recipe name: " + recipe.getDescription()
                    + ", please prepare " +  recipe.getPreparation());
        }
    }
}
