package Visitor;


public class GameCharacter implements GameCharacterState {

    private GameCharacterState state;

    public GameCharacter (String name, int level) {
        this.state = new Eevee(name, level);
    }

    private void evolve() {
        if (state.getLevel() == 3) {
            System.out.println(state.getName() + " is evolving...");
            state = new Vaporeon("Vaporeon", 3);
            System.out.println(state.getName() + " is born!");
        }
    }

    @Override
    public void accept(Visitor visitor) {
        state.accept(visitor);
    }

    @Override
    public void attack() {
        state.attack();
    }

    @Override
    public void levelUp() {
        state.levelUp();
        evolve();
    }

    @Override
    public String getName() {
        return state.getName();
    }

    @Override
    public int getLevel() {
        return state.getLevel();
    }
}


interface GameCharacterState {
    public void accept(Visitor visitor);

    public void attack();

    public void levelUp();

    public String getName();

    public int getLevel();
}

class Eevee implements GameCharacterState {
    private final String name;
    private int level;

    public Eevee(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void attack() {
        System.out.println("Eevee attacks!");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void levelUp() {
        level++;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Vaporeon implements GameCharacterState {
    private final String name;
    private int level;

    public Vaporeon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void attack() {
        System.out.println("Vaporeon attacks!");
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void levelUp() {
        level++;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}