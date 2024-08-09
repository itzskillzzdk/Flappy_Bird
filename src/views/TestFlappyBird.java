package views;

import controllers.GameController;

public class TestFlappyBird {

    public static void main(String[] args) {
        GameViewable view = new MainGUI();
        GameController controller = new GameController(view);
        controller.run();
    }
}