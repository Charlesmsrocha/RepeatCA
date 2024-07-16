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
        int count = 0;
        while (client.getSum() < 1000000) {
            int randomNumber = random.nextInt(12);
            client.addRandomNumber(randomNumber);
            synchronized (System.out) {
                System.out.print(randomNumber + " ");
                count++;
                if (count % 50 == 0 ) {
                    System.out.println();
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        System.out.println();
        
    }
        
}
