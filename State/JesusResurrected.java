package State;

public class JesusResurrected implements JesusState {
    @Override
    public void prostelytize() {
        System.out.println("Hey kids, wanna hear about the greatest story ever told?");
    }

    @Override
    public void spookDisciples() {
        System.out.println("👻👻👻👻👻");
    }

    @Override
    public void paintWithBobRoss() {
        System.out.println("Soon");
    }
}
