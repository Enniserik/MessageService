package messageservice;

import java.util.Random;

/**
 *
 * @author eennis
 */
public class RandomReader implements MessageReader {
    
    private RandomStringGenerator generator;
    private String[] animals = {
        "Camel",
        "Wolf",
        "Koala",
        "Giraffe",
        "Dugong",
        "Hippo",
        "Rhino",
        "Turtle",
        "Dog",
        "Tiger"
    };
    
    
    public RandomReader(){
        generator = new RandomStringGenerator();
    }
    
    @Override
    public String readMessage() {
        return animals[generator.getRandomNumber() - 1];
    }
    
}
