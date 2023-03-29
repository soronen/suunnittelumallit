package Builder;

import java.util.ArrayList;
import java.util.List;

public class BurgerIngredients {
    private List<String> ingredients;

    public BurgerIngredients() {
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BurgerIngredients{" +
                "ingredients=" + ingredients +
                '}';
    }
}