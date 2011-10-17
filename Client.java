import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.io.*; 
import java.rmi.registry.*;

public class Client { 
    public static void main(String args[]) {

 		Registry rejestr = null;
	try {
		rejestr = LocateRegistry.getRegistry("localhost");
	} catch(RemoteException e){
		System.out.println(e.getMessage());
	}
	
	try {
	    ServerIntf obj = (ServerIntf) Naming.lookup("some");
	

	System.out.println(obj.getMessage());
//	System.out.print("Podaj tekst. Zaczaruje go... :) ?>");
//     	InputStreamReader converter = new InputStreamReader(System.in); // pobieranie tekstu 
//	BufferedReader input = new BufferedReader(converter);           // z klawiatury
//	String str = "";		// do zmiennej str
//	str = input.readLine();	//
//	str = str.trim(); // ucinanie bialych znakow 
//	System.out.print("Podales: ");
//	System.out.println(str);	// wyswietlenie podanego ciagu znakow
//	System.out.print("Zaczarowany tekst: "); 
//	System.out.println(obj.odwrocString(str)); // wyswietlenie odwroconego ciagu znakow.
	    
	// Wyświetlenie listy aktywnych serwerów 	
	String lista[] = Naming.list("//localhost");
	for(String s : lista ){
		System.out.println(s);
	}

	} catch (Exception e) {
	    System.out.println(e.getMessage());	    
	}
    } // main
} // Client
