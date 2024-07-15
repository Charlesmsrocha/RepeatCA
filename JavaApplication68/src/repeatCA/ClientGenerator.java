package repeatCA;

import java.util.Random;

/**
 *
 * @author Charles Rocha
 */
public class ClientGenerator implements Runnable {
    private Client client;
    
    public ClientGenerator(Client client) {
        this.client = client;
    }
    
    @Override
        public void run() {
        Random random = new Random();
        while (client.getSum() < 1000000) {
            int randomNumber = random.nextInt(12);
            client.addRandomNumber(randomNumber);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (System.out) {
                System.out.print(client.getName() + randomNumber);
            }
            
        }
        
    }
        
}
