import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.io.*; 

public class Client { 
    public static void main(String args[]) {
	System.setProperty("java.security.policy", "client.policy");
	
        if (System.getSecurityManager() == null) 
            System.setSecurityManager(new RMISecurityManager());
	
	try {
	    ServerIntf obj = (ServerIntf) Naming.lookup("//localhost/some_name");
	    System.out.println(obj.getMessage());
	    System.out.print("Podaj tekst. Zaczaruje go... :) ?>");

     	    InputStreamReader converter = new InputStreamReader(System.in); // pobieranie tekstu 
	    BufferedReader input = new BufferedReader(converter);           // z klawiatury
	    String str = "";		// do zmiennej str
	    str = input.readLine();	//

	    str = str.trim(); // ucinanie bialych znakow 

	    System.out.print("Podales: ");
	    System.out.println(str);	// wyswietlenie podanego ciagu znakow

	    System.out.print("Zaczarowany tekst: "); 
	    System.out.println(obj.odwrocString(str)); // wyswietlenie odwroconego ciagu znakow.
	    
	} catch (Exception e) {
	    System.out.println(e.getMessage());	    
	}
    }
}
