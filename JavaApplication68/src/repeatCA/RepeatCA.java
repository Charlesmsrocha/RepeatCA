package repeatCA;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Charles Rocha
 */
public class RepeatCA {
    public static void main(String[] args) {
        try {
            // Start the RMI registry
            Registry registry = LocateRegistry.createRegistry(1099);

            // Create and bind the server
            ServerInterface server = new Server();
            registry.rebind("Server", server);
            System.out.println("Server is ready.");

            // Create clients and connect them to the server
            for (int i = 0; i < 5; i++) {
                new Client(server, i + 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
