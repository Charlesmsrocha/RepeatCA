package repeatCA;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charles Rocha
 */

public class Client {
    private String name;
    private List<Integer> randomNumbers;
    private int sum;
    
    public Client(String name) {
        this.name = name;
        this.randomNumbers = new ArrayList<>();
        this.sum = 0;
    }
       
    public synchronized void addRandomNumber(int number) {
        this.randomNumbers.add(number);
        this.sum += number;
    }
    
    public String getName() {
        return name;
    }
        
    public synchronized int getSum(){
        return sum;
    }
    
    public synchronized String getRandomNumbersAsString() {
        StringBuilder numbersStr = new StringBuilder();
        int count = 0;
        for (int num : randomNumbers) {
            if (count > 0 && count % 58 == 0) {
                numbersStr.append("\n");
            }
            numbersStr.append(num).append(" ");
            count++;
        }
        return numbersStr.toString().trim();
    }
    
}
