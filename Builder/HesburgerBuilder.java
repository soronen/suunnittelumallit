package Builder;

public class HesburgerBuilder extends BurgerBuilder {
    public void buildBun() {
        burger.addIngredient("Hesburgerin sämpylä");
    }

    public void buildPatty() {
        burger.addIngredient("Hesburgerin pihvi");
    }

    public void buildCheese() {
        burger.addIngredient("Hesburgerin juusto");
    }

    public void buildLettuce() {
        burger.addIngredient("Hesburgerin salaatti");
    }
}
