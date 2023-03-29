package Builder;

public class MacDonaldsBuilder extends BurgerBuilder {
    private StringBuilder burgerString;

    public MacDonaldsBuilder() {
        burgerString = new StringBuilder();
    }

    public void buildBun() {
        burgerString.append("Mäkkärin sämpylä");
    }

    public void buildPatty() {
        burgerString.append("Mäkkärin pihvi");
    }

    public void buildCheese() {
        burgerString.append("Mäkkörin juusto");
    }

    public void buildLettuce() {
        burgerString.append("Mäkkärin salaatti");
    }


    public BurgerIngredients getBurger() {
        BurgerIngredients burger = new BurgerIngredients();
        String[] ingredients = burgerString.toString().split(" ");
        for (String ingredient : ingredients) {
            burger.addIngredient(ingredient);
        }
        return burger;
    }
}
