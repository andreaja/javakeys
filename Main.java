import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

/**
 * http://www.java2s.com/Tutorial/Java/0260__Swing-Event/CreatingaKeyStrokeandBindingIttoanAction.htm
 */
public class Main {
    public static void main(String[] argv) throws Exception {
        JFrame frame = new JFrame("KeyStroke Sample");
        
        JButton component = new JButton("Button");
        component.getInputMap().put(KeyStroke.getKeyStroke("F2"), "actionName");
        component.getInputMap().put(KeyStroke.getKeyStroke("control A"), "actionName");
        component.getInputMap().put(KeyStroke.getKeyStroke("control E"), "actionName");
        component.getInputMap().put(KeyStroke.getKeyStroke("shift F2"), "actionName");
        component.getInputMap().put(KeyStroke.getKeyStroke('('), "actionName");
        component.getInputMap().put(KeyStroke.getKeyStroke("button3 F"), "actionName");
        component.getInputMap().put(KeyStroke.getKeyStroke("control PERIOD"), "actionName");
        component.getInputMap().put(KeyStroke.getKeyStroke("typed x"), "actionName");
        component.getInputMap().put(KeyStroke.getKeyStroke("released DELETE"), "actionName");
        component.getInputMap().put(KeyStroke.getKeyStroke("shift UP"), "actionName");

        component.getActionMap().put("actionName", new AbstractAction("actionName") {
                public void actionPerformed(ActionEvent evt) {
                    System.out.println(evt);
                }
            });
        frame.add(component);
        frame.setSize(400, 200);
        frame.setVisible(true);
        
    }
}
