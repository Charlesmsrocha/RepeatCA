package repeatCA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Charles Rocha
 */
public class RepeatCA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Client> clients = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        
        //Getting the names
        for (int i = 0; i<5;i++){
            System.out.println("Enter the name of the client " + (i+1) +": ");
            String name = scanner.nextLine();
            Client client = new Client(name);
            clients.add(client);
            
            ClientGenerator generator = new ClientGenerator(client);
            Thread thread = new Thread(generator);
            threads.add(thread);
            thread.start();
        }
        
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
                    
         //Displayng the names of the clients
            System.out.println("\nList of clients and their random numbers:");
            for (Client client : clients) {
                System.out.println(client.getName() + " - Random number: " + client.getRandomNumbersAsString());
                System.out.println("Sum: " + client.getSum());
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            }
        
            scanner.close();
    }
}
