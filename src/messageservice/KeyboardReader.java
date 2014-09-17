package messageservice;

import java.util.Scanner;

/**
 *
 * @author eennis
 */
public class KeyboardReader implements MessageReader {
    
    @Override
    public String readMessage() {
        Scanner keyboard = new Scanner(System.in);  
        String line = "";
        String keyboardInput = "";
        System.out.println("Please enter your message. Enter e to exit.");
        while(!line.equals("e")){
            line = keyboard.nextLine();
            if(line.equals("e")){
                break;
            }
            keyboardInput += line;
        }
        keyboard.close();
        return keyboardInput;
    }

}
