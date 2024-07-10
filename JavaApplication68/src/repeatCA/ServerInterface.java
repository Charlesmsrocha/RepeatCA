package repeatCA;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Charles Rocha
 */

public interface ServerInterface  extends Remote {
    void addInteger(int value) throws RemoteException;
    int getTotal() throws RemoteException;
    List<Integer> getNumList() throws RemoteException;
    void incrementClientCount() throws RemoteException;
    int getClientCount() throws RemoteException;
}
