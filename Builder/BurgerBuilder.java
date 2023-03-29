package Builder;

public abstract class BurgerBuilder {
    protected BurgerIngredients burger;

    public BurgerIngredients getBurger() {
        return burger;
    }

    public void createNewBurger() {
        burger = new BurgerIngredients();
    }

    public abstract void buildBun();
    public abstract void buildPatty();
    public abstract void buildCheese();
    public abstract void buildLettuce();
}