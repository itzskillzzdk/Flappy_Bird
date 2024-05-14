package views.utils;

import javax.swing.*;
import java.awt.*;

public class Utils {
    public static ImageIcon getResizeImage(String path, int width, int height) {
        return new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)
        );
    }
}
