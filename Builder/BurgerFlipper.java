package Builder;

public class BurgerFlipper {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder builder) {
        burgerBuilder = builder;
    }

    public BurgerIngredients getBurger() {
        return burgerBuilder.getBurger();
    }

    public void constructBurger() {
        burgerBuilder.createNewBurger();
        burgerBuilder.buildBun();
        burgerBuilder.buildPatty();
        burgerBuilder.buildCheese();
        burgerBuilder.buildLettuce();
    }
}