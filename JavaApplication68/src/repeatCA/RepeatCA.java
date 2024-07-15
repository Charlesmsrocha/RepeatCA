package repeatCA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Charles Rocha
 */
public class RepeatCA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Client> clients = new ArrayList<>();
        Random random = new Random();
        
        //Getting the names
        for (int i = 0; i<5;i++){
            System.out.println("Enter the name of the client " + (i+1) +": ");
            String name = scanner.nextLine();
            clients.add(new Client(name));
        }
        
        int total = 0;
        while (total < 100) {
            for (Client client : clients) {
                if (total >= 100) {
                    break;
                }
                int randomNumber = random.nextInt(12) +1;
                client.addRandomNumber(randomNumber);
                total += randomNumber;
            }
        }
            
         //Displayng the names of the clients
            System.out.println("\nList of clients:");
            for (Client client : clients) {
                System.out.println(client.getName() + " - Random number: " + client.getRandomNumbersAsString());
            }
        
            scanner.close();
    }
}
