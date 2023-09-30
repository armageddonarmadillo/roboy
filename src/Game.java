import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Game extends Scene{
    static int gw = 1280, gh = 720;

    Roboy roboy;

    Game(){init();}

    void init(){
        //setup game
        roboy = new Roboy(50, 50);
    }
    void update(){
        //update elements
        roboy.update();
    }

    @Override
    public void paint(Graphics g) {
        update();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, gw, gh);

        //image test
        roboy.draw(g);

        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
}
