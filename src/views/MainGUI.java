package views;

import config.GameConfiguration;
import views.panels.BackgroundPanel;
import views.panels.GamePanel;

import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame implements Runnable {

    public static final int TICK = 10;

    private GamePanel gamePanel = new GamePanel();

    public MainGUI(){
        super("Flappy Bird");

        // We need to set the size of the contentPane and not the frame because of the frame insets take extra 8 pixels and so hide some part of the container in the frame.
        // We can verify it by printing : frame.getSize(); frame.getContentPane().getSize(); and frame.getInsets();
        Container container = getContentPane();
        container.setPreferredSize(GameConfiguration.WINDOW_DIMENSION);

        container.add(gamePanel);

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void run() {
        BackgroundPanel backgroundPanel = gamePanel.getBackgroundPanel();
        while(true) {
            int pos = backgroundPanel.getXPosBackground();
            backgroundPanel.setXPosBackground(pos - 1);
            backgroundPanel.repaint();

            try { Thread.sleep(TICK); } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }
}
