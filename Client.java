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
ServerIntf obj = (ServerIntf) rejestr.lookup("some_name");
    
 System.out.println(obj.getMessage());

//System.out.print("Podaj tekst. Zaczaruje go... :) ?>");
//   BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
// tworzenie obiektu do przetworzenia stringu
//   String str = input.readLine(); // pobieranie tekstu z klawiatury
//  str = str.trim(); // ucinanie bialych znakow
//  System.out.print("Podales: ");
//  System.out.println(str); // wyswietlenie podanego ciagu znakow
//  System.out.print("Zaczarowany tekst: ");
//  System.out.println(obj.odwrocString(str)); // wyswietlenie odwroconego ciagu znakow.


String str[] = Naming.list("//localhost");

for(String s :str ){
    System.out.println(s);
}


    } catch (Exception e) {
            System.out.println(e.getMessage());
    }// catch 
    } // main
} // class Client
