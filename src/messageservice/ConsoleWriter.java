package messageservice;

/**
 *
 * @author eennis
 */
public class ConsoleWriter implements MessageWriter {

    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
    
}
