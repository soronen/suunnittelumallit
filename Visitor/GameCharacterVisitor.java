package Visitor;

interface Visitor {
    public void visit(Eevee eevee);

    public void visit(Vaporeon vaporeon);
}


class BonusVisitor implements Visitor {
    public void visit(Eevee eevee) {
        int bonusPoints = eevee.getLevel() * 5;
        System.out.println("Eevee's bonus points: " + bonusPoints);
    }

    public void visit(Vaporeon vaporeon) {
        int bonusPoints = vaporeon.getLevel() * 10;
        System.out.println("Vaporeon's bonus points: " + bonusPoints);
    }
}