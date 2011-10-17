import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*; 
 
public class Server extends UnicastRemoteObject implements ServerIntf {

    public Server() throws RemoteException {
	super();
    }
    
    public String getMessage() {
        return "Helou :)";
    }

    public String odwrocString(String str) {
		String odwr = new StringBuffer(str).reverse().toString();
		return odwr;
    }    
    
    public static void main(String args[]) throws RemoteException {
	
//	LocateRegistry.createRegistry(1099);
	
        try {
	   // Server obj = new Server();
	    Naming.bind("//localhost/some_name");
        }
        catch(AlreadyBoundException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
