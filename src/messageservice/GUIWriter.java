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
        
        /**
         * JOptionPane has problems running with Scanner.nextLine() (something to
         * do with threads, need to look into more). Putting the option pane inside
         * a JDialog gives us access to methods such as setAlwaysOnTop.
        */
        
        JDialog dialog = new JOptionPane("Your input was: " + message).createDialog("GUIWriter");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        dialog.dispose();
        
    }
    
}
