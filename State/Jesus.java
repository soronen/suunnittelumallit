package State;

public class Jesus implements JesusState {
    private JesusState state;
    private int actions = 0;

    public Jesus() {
        state = new JesusAlive();
    }

    private void nextStage() {
        if (actions >= 3) {
            System.out.println("\njesus is evolving...\n");
            if (state instanceof JesusAlive) {
                state = new JesusDead();
            } else if (state instanceof JesusDead) {
                state = new JesusResurrected();
            } else if (state instanceof JesusResurrected) {
                state = new JesusAscended();
            } else {
                System.out.println("Jesus is already ascended. Can't go back");
            }
            actions = 0;
        }
    }

    @Override
    public void prostelytize() {
        state.prostelytize();
        actions++;
        nextStage();

    }

    @Override
    public void spookDisciples() {
        state.spookDisciples();
        actions++;
        nextStage();
    }

    @Override
    public void paintWithBobRoss() {
        state.paintWithBobRoss();
        actions++;
        nextStage();
    }
}
