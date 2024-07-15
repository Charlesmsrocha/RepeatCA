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
        
        //Getting the names
        for (int i = 0; i<5;i++){
            System.out.println("Enter the name of the client " + (i+1) +": ");
            String name = scanner.nextLine();
            clients.add(new Client(name));
        }
            
         //Displayng the names of the clients
            System.out.println("\nList of clients:");
            for (Client client : clients) {
                System.out.println(client.getname() + " - Random number: " + client.getRandomNumber());
            }
        
            scanner.close();
    }
}
