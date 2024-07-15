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
    private int sum;
    
    public Client(String name) {
        this.name = name;
        this.randomNumbers = new ArrayList<>();
        this.sum = 0;
        generateRandomNumbers();
    }
    
    private void generateRandomNumbers() {
        Random random = new Random();
        while (sum < 1000000) {
            int randomNumber = random.nextInt(12) + 1;
            this.randomNumbers.add(randomNumber);
            this.sum += randomNumber;
        }
    }
    
    public void addRandomNumber(int number) {
        this.randomNumbers.add(number);
    }
    
    public String getName() {
        return name;
    }
    
    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }
    
    public int getSum(){
        return sum;
    }
    
    public String getRandomNumbersAsString() {
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
