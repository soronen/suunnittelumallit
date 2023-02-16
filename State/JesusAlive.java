package State;

public class JesusAlive implements JesusState {
    @Override
    public void prostelytize() {
        System.out.println("Hey kids, wanna hear about the greatest story ever told?");

    }

    @Override
    public void spookDisciples() {
        System.out.println("Maybe later");
    }

    @Override
    public void paintWithBobRoss() {
        System.out.println("Who's Bob Ross?");

    }
}
