import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*; 
 
public class Server extends UnicastRemoteObject implements ServerIntf {

    public Server() throws RemoteException {
	super();
    }
    
    public String getMessage() {
        return "Hello World!";
    }
    
    public static void main(String args[]) throws RemoteException {
	System.setProperty("java.security.policy", "server.policy");
	
        if (System.getSecurityManager() == null) 
	    System.setSecurityManager(new RMISecurityManager());
	
	LocateRegistry.createRegistry(1099);
	
        try {
	    Server obj = new Server();
	    Naming.rebind("//localhost/some_name", obj);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }
}
