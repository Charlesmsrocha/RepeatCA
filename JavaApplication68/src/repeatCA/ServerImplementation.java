package repeatCA;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charles Rocha
 */

public class ServerImplementation extends UnicastRemoteObject implements ServerInterface {
    private List<Integer> numList;
    private int total;
    private int clientCount;

    protected ServerImplementation() throws RemoteException {
        numList = new ArrayList<>();
        total = 0;
        clientCount = 0;
    }

    @Override
    public synchronized void addInteger(int value) throws RemoteException {
        numList.add(value);
        total += value;
    }

    @Override
    public synchronized int getTotal() throws RemoteException {
        return total;
    }

    @Override
    public synchronized List<Integer> getNumList() throws RemoteException {
        return numList;
    }

    @Override
    public synchronized void incrementClientCount() throws RemoteException {
        clientCount++;
    }

    @Override
    public synchronized int getClientCount() throws RemoteException {
        return clientCount;
    }
}
