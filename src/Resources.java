import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Resources {
    public final static BufferedImage robot;

    static {
        try {
            robot = ImageIO.read(new File("./assets/roboy/roboy_64x64_SAMPLE.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
