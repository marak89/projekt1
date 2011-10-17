import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.rmi.server.UnicastRemoteObject;
<<<<<<< HEAD

import java.rmi.AlreadyBoundException;
import java.rmi.*;
import java.rmi.registry.*; 
=======
import java.rmi.*; 
>>>>>>> 8fdac6c0a5f0ebb88fc4a10b6cce089b09c33eba
 
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
    
<<<<<<< HEAD
   
 public static void main(String args[]) throws RemoteException {

        try {
	    Server obj = new Server();
	    Naming.rebind("//localhost:1099/some", obj);
	    
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}


    } // public static void main
} // public class Server
=======
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
>>>>>>> 8fdac6c0a5f0ebb88fc4a10b6cce089b09c33eba
