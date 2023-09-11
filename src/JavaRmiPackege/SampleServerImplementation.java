package JavaRmiPackege;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;


public class SampleServerImplementation extends UnicastRemoteObject implements SampleServer {
	public SampleServerImplementation() throws RemoteException{
		super();
		
	}
   public int add(int a,int b) throws RemoteException{
	   return a+b;
   }
}
