package messageservice;

import java.util.Scanner;

/**
 *
 * @author eennis
 */
public class KeyboardReader implements MessageReader {
    
    private Scanner keyboard = new Scanner(System.in);
    private String keyboardInput;
    
    @Override
    public String getMessage() {
        System.out.println("Please enter your message.");
        keyboardInput = keyboard.nextLine();
        keyboard.close();
        return keyboardInput;
    }

}
