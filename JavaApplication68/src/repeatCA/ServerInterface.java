package repeatCA;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Charles Rocha
 */
public interface ServerInterface extends Remote {
    void connect(ClientInterface client) throws RemoteException;
    void addNumber(int number) throws RemoteException;
    int getTotal() throws RemoteException;
    int[] getNumbers() throws RemoteException;
    void registerName(String name) throws RemoteException;
}
