package messageservice;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erik
 */
public class RandomStringGenerator {
    
    private Random rand = new Random();
    private int num;
    
    private int getRandomNumber(){
        num = rand.nextInt(10);
        return num;
    }
    
    public String getRandomString(){
        
        switch(getRandomNumber()){
            case 0:
                return "Camel";
            case 1:
                return "Rhino";
            case 2:
                return "Monkey";
            case 3:
                return "Koala";
            case 4:
                return "Bear";
            case 5:
                return "Dugong";
            case 6:
                return "Gryphon";
            case 7:
                return "Giraffe";
            case 8:
                return "Crocodile";
            case 9:
                return "Wolf";
            default:
                return "Number Generated is out of bounds";
        }

    }
    
}
