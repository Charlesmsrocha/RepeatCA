package repeatCA;

import java.util.Random;



/**
 *
 * @author Charles Rocha
 */

public class Client {
    private String name;
    private int randomNumber;
    
    public Client(String name) {
        this.name = name;
        this.randomNumber = generateRandomNumber();
    }
    
    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(12) +1; //random number from 1 to 12
    }
    
    public String getname() {
        return name;
    }
    
    public int getRandomNumber() {
        return randomNumber;
    }
    
}
