package messageservice;

import java.util.Random;

/**
 *
 * @author eennis
 */
public class RandomReader implements MessageReader {
    
    private RandomStringGenerator generator;
    
    public RandomReader(){
        generator = new RandomStringGenerator();
    }
    
    @Override
    public String getMessage() {
        return generator.getRandomString();
    }
    
}
