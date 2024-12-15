package encode;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class ImageUtil {

    public static byte[] imageToBytes(Component parent, JLabel label) {
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = fileChooser.showOpenDialog(parent);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                byte[] imageBytes = readFileToBytes(selectedFile);

                BufferedImage img = ImageIO.read(new FileInputStream(selectedFile));
                if (img != null) {
                    Image scaledImage = img.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(scaledImage);
                    label.setIcon(icon);
                }
                return imageBytes;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] readFileToBytes(File file) {
        try (FileInputStream fis = new FileInputStream(file);
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void setImageLabelFromBytes(byte[] imageBytes, JLabel label) {
        if (imageBytes != null) {
            try {
                ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                BufferedImage img = ImageIO.read(bais);
                if (img != null) {
                    Image scaledImage = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(scaledImage);
                    label.setIcon(icon);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static ImageIcon bytesToImageIcon(byte[] imageBytes, int width, int height) {
        if (imageBytes != null) {
            try {
                ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                BufferedImage img = ImageIO.read(bais);
                if (img != null) {
                    Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                    return new ImageIcon(scaledImage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}