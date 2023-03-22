package Visitor;

public class Main {
    public static void main(String[] args) {
        GameCharacter digimon = new GameCharacter("Eveliina", 1);
        Visitor bonusVisitor = new BonusVisitor();


        System.out.println(digimon.getName() + "'s level: " + digimon.getLevel()); // Eveliina's level: 1
        digimon.accept(bonusVisitor); // Eevee's bonus points: 5

        digimon.levelUp(); // 2
        digimon.attack();  // Eveliina attacks!
        digimon.levelUp(); // 3 - evolution
        digimon.levelUp(); // 4

        System.out.println(digimon.getName() + "'s level: " + digimon.getLevel()); //
        digimon.accept(bonusVisitor); // Vaporeon's bonus points: 40




    }
}
