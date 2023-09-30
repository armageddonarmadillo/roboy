import javax.swing.*;

public class Window extends JFrame {
    Scene current_scene;

    Window(Scene instance){
        current_scene = instance;
        add(instance);
        pack();
        setVisible(true);
        setSize(Game.gw, Game.gh);
        setLocationRelativeTo(null);
        setTitle("Roboy Avdentuesr");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(instance);
    }
}
