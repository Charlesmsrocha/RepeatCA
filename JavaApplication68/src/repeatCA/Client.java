package repeatCA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



/**
 *
 * @author Charles Rocha
 */

public class Client {
    private String name;
    private List<Integer> randomNumbers;
    
    public Client(String name) {
        this.name = name;
        this.randomNumbers = new ArrayList<>();
    }
    
    public void addRandomNumber(int number) {
        this.randomNumbers.add(number);
    }
    
    public int getSumOfRandomNumbers() {
    int sum = 0;
    for (int num : randomNumbers) {
        sum += num;
        }
        return sum;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }
    
    public String getRandomNumbersAsString() {
    StringBuilder numbersStr = new StringBuilder();
    for (int num : randomNumbers) {
        numbersStr.append(num).append(" ");
        }
        return numbersStr.toString().trim();
    }
    
}
