package repeatCA;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;
import java.util.List;

/**
 *
 * @author Charles Rocha
 */
public interface ServerInterface extends Remote {
    void connect(ClientInterface client) throws RemoteException;
    void addNumber(int number, ClientInterface client) throws RemoteException;
    int getTotal() throws RemoteException;
    int[] getNumbers() throws RemoteException;
    void registerName(String name) throws RemoteException;
    Map<ClientInterface, List<Integer>> getClientNumbers() throws RemoteException;
}
