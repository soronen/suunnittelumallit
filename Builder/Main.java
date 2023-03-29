package Builder;

public class Main {
    public static void main(String[] args) {
        BurgerFlipper director = new BurgerFlipper();
        BurgerBuilder hesburgerBuilder = new HesburgerBuilder();
        BurgerBuilder mcdonaldsBuilder = new MacDonaldsBuilder();

        director.setBurgerBuilder(hesburgerBuilder);
        director.constructBurger();
        BurgerIngredients hesburger = director.getBurger();

        System.out.println("Hesburgerburger: " + hesburger);

        director.setBurgerBuilder(mcdonaldsBuilder);
        director.constructBurger();
        BurgerIngredients mcdonalds = mcdonaldsBuilder.getBurger();
        System.out.println("Mäkkärin hampurilainen: " + mcdonalds);
    }
}