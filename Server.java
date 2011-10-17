import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
import java.rmi.registry.*; 
 
public class Server extends UnicastRemoteObject implements ServerIntf {

    public Server() throws RemoteException {
	super();
    }
    
    public String getMessage() {
        return "Helou :)";
    }
   
 public static void main(String args[]) throws RemoteException {

        try {
	    Server obj = new Server();
	    Naming.rebind("//localhost:1099/some", obj);
	    
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}


    } // public static void main
} // public class Server
