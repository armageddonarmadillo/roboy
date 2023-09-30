import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Roboy {
    int x, y, w, h, xspeed, yspeed;
    Image img = Resources.robot.getScaledInstance(512, 512, Image.SCALE_SMOOTH);

    Roboy(int x, int y){
        this.x = x;
        this.y = y;
        w = img.getWidth(null);
        h = img.getHeight(null);
        xspeed = 0;
        yspeed = 0;
    }

    void update(){
        x+=xspeed;
        y+=yspeed;
    }

    void draw(Graphics g){
        g.drawImage(img, x, y, null);
    }
}
