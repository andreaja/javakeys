import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;

/**
 * From IDEA issue tracker IDEABKL-3826
 * http://youtrack.jetbrains.net/issue/IDEABKL-3826
 */
class KeyDebugWindow extends JFrame {
    
    KeyDebugWindow() {
        addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent event) {
                    System.out.println(event);
                    System.out.println("keyPressed called; " +
                                       "code: " + event.getKeyCode() +
                                       ", char: " + event.getKeyChar() +
                                       ", location: " + event.getKeyLocation() +
                                       ", keytext: " + KeyEvent.getKeyText(event.getKeyCode())
                                       );
                    KeyStroke stroke = KeyStroke.getKeyStrokeForEvent(event);
                    System.out.println("Stroke: " +stroke+
                                       " code: " +stroke.getKeyCode() +
                                       " char: " + stroke.getKeyChar());
                    KeyStroke strokeChar = KeyStroke.getKeyStroke(event.getKeyChar());
                    System.out.println("StrokeChar: " +strokeChar+
                                       " code: " +strokeChar.getKeyCode() +
                                       " char: " + strokeChar.getKeyChar());

                }
            });
    }
    
    public static void main(String[] args) {
        new KeyDebugWindow().setVisible(true);
    }
}
