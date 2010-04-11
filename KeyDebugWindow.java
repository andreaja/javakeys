import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * From IDEA issue tracker IDEABKL-3826
 * http://youtrack.jetbrains.net/issue/IDEABKL-3826
 */
class KeyDebugWindow extends JFrame {
    
    KeyDebugWindow() {
        addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent event) {
                    System.out.println("keyPressed called; " +
                                       "code: " + event.getKeyCode() +
                                       ", char: " + event.getKeyChar() +
                                       ", location: " + event.getKeyLocation());
                }
            });
    }
    
    public static void main(String[] args) {
        new KeyDebugWindow().setVisible(true);
    }
}
