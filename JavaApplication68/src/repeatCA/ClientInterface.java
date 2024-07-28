package repeatCA;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Charles Rocha
 */

public interface ClientInterface extends Remote {
    void startGenerating() throws RemoteException;
}
