package config;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GameConfiguration {

    public final static int WINDOW_WIDTH = 600;
    public final static int WINDOW_HEIGHT = 800;
    public final static Dimension WINDOW_DIMENSION = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
    public final static Dimension BACKGROUND_DIMENSION = new Dimension(WINDOW_WIDTH, 4 * WINDOW_HEIGHT / 5);
    public final static Dimension GROUND_DIMENSION = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT / 5);

    public final static String BACKGROUND_IMG_PATH = "src/images/backgrounds/minecraft.png";
    public final static String GROUND_IMG_PATH = "src/images/grounds/minecraft.png";
    public final static Image BACKGROUND_IMG = new ImageIcon(BACKGROUND_IMG_PATH).getImage();
    public final static Image GROUND_IMG = new ImageIcon(GROUND_IMG_PATH).getImage();
    public final static int BACKGROUND_WIDTH = BACKGROUND_IMG.getWidth(null);

    public final static int BIRD_SIZE = 64;

}
