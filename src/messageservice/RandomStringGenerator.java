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
    
    private Random rand = new Random(System.nanoTime());
    private int num;
    
    public int getRandomNumber(){
        num = rand.nextInt(10);
        return num;
    }
    
}
