package GUI.Custom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ResizeImage {

    private BufferedImage img;
    private ImageIcon imageIcon = null;

    public ImageIcon ResizeImage(String imagePath, byte[] pic, int W, int H) {
        ImageIcon myImage = null;
        if (imagePath != null) {
            myImage = new ImageIcon(getClass().getResource(imagePath));
        } else {
            myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(W, H, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }

    public ImageIcon resizeImage(ImageIcon icon, byte[] pic, int W, int H) {
        ImageIcon myImage = icon;
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(W, H, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }

    public ImageIcon getImageURL(String str) {
        try {
            URL url = new URL(str);
            img = ImageIO.read(url);
            imageIcon = new ImageIcon(img);
        } catch (IOException ex) {
            System.err.println(ex);
        }
        return imageIcon;
    }
}
