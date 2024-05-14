package views.panels;

import javax.swing.*;
import java.awt.*;

import static config.GameConfiguration.*;

public class GroundPanel extends JPanel {

    private Image groundImage;

    public GroundPanel() {
        groundImage = GROUND_IMG;
        setPreferredSize(GROUND_DIMENSION);
    }

    public Image getGroundImg() { return groundImage; }

    public void setGroundImg(Image groundImg) { this.groundImage = groundImg; }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        drawGround(g2d);
    }

    private void drawGround(Graphics2D g2d) {
        Image groundImg = getGroundImg();
        g2d.drawImage(groundImg, 0, 0, null);
    }
}
