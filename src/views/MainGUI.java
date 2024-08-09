package views;

import config.GameConfiguration;
import controllers.GameController;
import controllers.GameState;
import views.panels.BackgroundPanel;
import views.panels.GamePanel;
import views.panels.GroundPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameView extends JFrame implements Runnable, GameViewable {

    public static final int BACKGROUND_SCROLLING_SPEED = 10;
    public static final int GROUND_SCROLLING_SPEED = 10;

    private GameController gc;
    private GamePanel gamePanel = new GamePanel();

    public GameView(){
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

        addKeyListener(new KeyEventListener());
        System.out.println("KeyEventListener added to GameView.");
    }

    @Override
    public void run() {
        BackgroundPanel backgroundPanel = gamePanel.getBackgroundPanel();
        GroundPanel groundPanel = gamePanel.getGroundPanel();
        System.out.println("GameState = " + gc.getGameState());
        while(true) {
            if(gc.getGameState() == GameState.Playing){
                scrollTheBackground(backgroundPanel);
                scrollTheGround(groundPanel);
            }
            System.out.println("GameState = " + gc.getGameState());
        }
    }

    @Override
    public void setController(GameController gc) {
        this.gc = gc;
    }

    @Override
    public void launch() {
        GameView gv = this;
        Thread appThread = new Thread(gv);
        appThread.start();
    }

    private void scrollTheBackground(BackgroundPanel backgroundPanel) {
        int pos = backgroundPanel.getXPosBackground();
        // Scrolling the background to the left
        backgroundPanel.setXPosBackground(pos - 1);
        backgroundPanel.repaint();
        try { Thread.sleep(BACKGROUND_SCROLLING_SPEED); } catch (InterruptedException e) { throw new RuntimeException(e); }
    }

    private void scrollTheGround(GroundPanel groundPanel) {
        int pos = groundPanel.getXPosGround();
        // Scrolling the ground to the left
        groundPanel.setXPosGround(pos - 1);
        groundPanel.repaint();
        try { Thread.sleep(GROUND_SCROLLING_SPEED); } catch (InterruptedException e) { throw new RuntimeException(e); }
    }

    public class KeyEventListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            if(gc.getGameState() == GameState.Home) {
                if (e.getKeyChar() == KeyEvent.VK_SPACE) {
                    System.out.println("'Space' has been typed.");
                    gc.setGameState(GameState.Playing);
                    System.out.println("GameState has been changed to Playing.");
                }
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
