package views;

import javax.swing.*;

public class TestFlappyBird {

    public static void main(String[] args) {
        MainGUI app = new MainGUI();
        Thread appThread = new Thread(app);
        appThread.start();
    }

}