package views.panels;

import javax.swing.*;

import java.awt.*;

import static config.GameConfiguration.WINDOW_DIMENSION;

public class GamePanel extends JPanel {

    private GroundPanel groundPanel = new GroundPanel();
    private BackgroundPanel backgroundPanel = new BackgroundPanel();

    public GamePanel() {
        setPreferredSize(WINDOW_DIMENSION);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(backgroundPanel);
        add(groundPanel);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

    }

    public GroundPanel getGroundPanel() { return groundPanel; }

    public BackgroundPanel getBackgroundPanel() { return backgroundPanel; }
}
