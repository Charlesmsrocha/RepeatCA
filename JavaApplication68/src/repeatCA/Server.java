package repeatCA;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charles Rocha
 */
public class Server extends UnicastRemoteObject implements ServerInterface {
    private List<ClientInterface> clients;  // List of connected clients
    private List<Integer> numList;  // List of generated numbers
    private int total;  // Total sum of numbers
    private List<String> clientNames;  // List of client names

    protected Server() throws RemoteException {
        clients = new ArrayList<>();
        numList = new ArrayList<>();
        total = 0;
        clientNames = new ArrayList<>();
    }

    @Override
    public synchronized void connect(ClientInterface client) throws RemoteException {
        clients.add(client);
    }

    @Override
    public synchronized void addNumber(int number) throws RemoteException {
        numList.add(number);
        total += number;
    }

    @Override
    public synchronized int getTotal() throws RemoteException {
        return total;
    }

    @Override
    public synchronized int[] getNumbers() throws RemoteException {
        return numList.stream().mapToInt(i -> i).toArray();
    }

    @Override
    public synchronized void registerName(String name) throws RemoteException {
        clientNames.add(name);
        if (clientNames.size() >= 5) {
            for (ClientInterface client : clients) {
                new Thread(() -> {
                    try {
                        client.startGenerating();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        }
    }
}

