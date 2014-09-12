package messageservice;

/**
 *
 * @author eennis
 */
public class ConsoleWriter implements MessageWriter {

    @Override
    public void outputMessage(String message) {
        System.out.println(message);
    }
    
}
