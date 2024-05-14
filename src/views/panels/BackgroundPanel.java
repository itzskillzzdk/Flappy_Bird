package views.panels;

import config.GameConfiguration;
import views.MainGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static config.GameConfiguration.*;

public class BackgroundPanel extends JPanel {

    private Image backgroundImg;
    private int xPosBackground;

    public BackgroundPanel() {
        backgroundImg = BACKGROUND_IMG;
        setPreferredSize(BACKGROUND_DIMENSION);
    }

    public Image getBackgroundImg() { return backgroundImg; }

    public void setBackgroundImg(Image backgroundImg) { this.backgroundImg = backgroundImg; }

    public int getXPosBackground() { return xPosBackground; }

    public void setXPosBackground(int xPosBackground) { this.xPosBackground = xPosBackground; }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        drawBackground(g2d);
    }

    private void drawBackground(Graphics2D g2d) {
        if(xPosBackground == -BACKGROUND_WIDTH) { xPosBackground = 0; }
        g2d.drawImage(backgroundImg, xPosBackground, 0, null);
        g2d.drawImage(backgroundImg, xPosBackground + BACKGROUND_WIDTH, 0, null);
    }
}
