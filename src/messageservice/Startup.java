package messageservice;

/**
 *
 * @author eennis
 */
public class Startup {

    
    public static void main(String[] args) {
        
        MessageService ms = new MessageService(new KeyboardReader(), new ConsoleWriter());
        
        ms.processMessage();
        
    }
    
}
