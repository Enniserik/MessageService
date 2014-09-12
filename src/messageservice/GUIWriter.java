package messageservice;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author eennis
 */
public class GUIWriter implements MessageWriter {

    @Override
    public void outputMessage(String message) {

        JDialog dialog = new JOptionPane(message).createDialog("GUIWriter");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        dialog.dispose();
        
    }
    
    
    
}
