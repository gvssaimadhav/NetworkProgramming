import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.*;

public class Main {

public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable(){
@Override
public void run() {
JFrame frame = new JFrame("Image Timer");
frame.add(new ImagePanel());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setLocationRelativeTo(null);
frame.setVisible(true);
}
});
}

private static class ImagePanel extends JPanel {

URL[] urls;
Image[] images;
Random rand = new Random();

public ImagePanel() {
urls = new URL[4];
try {
urls[0] = new URL(" https://cdn-dmpbo.nitrocdn.com/sTfxmDcplhzyoBVcguAegkZcSjDCGcXk/assets/static/source/rev-19bfa43/wp-content/uploads/2019/09/gopinath.jpg");
urls[1] = new URL(" https://vitap.ac.in/wp-content/uploads/2020/07/Dr.-HUSSAIN-SYED.jpg");
urls[2] = new URL(" https://cdn-dmpbo.nitrocdn.com/sTfxmDcplhzyoBVcguAegkZcSjDCGcXk/assets/static/source/rev-19bfa43/wp-content/uploads/2019/06/Dr.-SUDHAKAR-ILANGO-1.jpg");
urls[3] = new URL(" https://vitap.ac.in/wp-content/uploads/2019/06/Dr.-S.-SIBI-CHAKRAVARTY.jpg");

images = new Image[4];
images[0] = ImageIO.read(urls[0]);
images[1] = ImageIO.read(urls[1]);
images[2] = ImageIO.read(urls[2]);
images[3] = ImageIO.read(urls[3]);

} catch (MalformedURLException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
}
setBackground(Color.BLACK);

Timer timer = new Timer(5000, new ActionListener(){
@Override
public void actionPerformed(ActionEvent e) {
repaint();
}
});
timer.start();
}


//static int a[] = {0,1,2,3};
@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);

g.setColor(Color.WHITE);
g.drawImage(images[0], 0, 0,200,200, this);
g.drawImage(images[1], 200, 0,200,200, this);
g.drawImage(images[2], 0, 200,200,200, this);
g.drawImage(images[3], 200, 200,200,200, this);
Image temp=images[0];
for(int i=0;i<3;i++)
{
images[i]=images[i+1];
}
images[3]=temp;


}

@Override
public Dimension getPreferredSize() {
return new Dimension(1920, 1080);
}
}
}