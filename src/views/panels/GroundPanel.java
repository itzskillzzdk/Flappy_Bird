package views.panels;

import javax.swing.*;
import java.awt.*;

import static config.GameConfiguration.*;

public class GroundPanel extends JPanel {

    private Image groundImg;
    private int xPosGround;

    public GroundPanel() {
        groundImg = GROUND_IMG;
        setPreferredSize(GROUND_DIMENSION);
    }

    public Image getGroundImg() { return groundImg; }

    public void setGroundImg(Image groundImg) { this.groundImg = groundImg; }

    public int getXPosGround() { return xPosGround; }

    public void setXPosGround(int xPosBackground) { this.xPosGround = xPosBackground; }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        drawGround(g2d);
    }

    private void drawGround(Graphics2D g2d) {
        if(xPosGround == -GROUND_WIDTH) { xPosGround = 0; }
        g2d.drawImage(groundImg, xPosGround, 0, null);
        g2d.drawImage(groundImg, xPosGround + GROUND_WIDTH, 0, null);
    }
}
