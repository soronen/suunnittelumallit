package Command;

import javafx.scene.Node;
import javafx.scene.control.Button;

public class WallButton extends Button {
    Command cmd;

    public WallButton(String text, Command cmd) {
        super(text);
        this.cmd = cmd;
    }

    public void push() {
        cmd.execute();
    }
}