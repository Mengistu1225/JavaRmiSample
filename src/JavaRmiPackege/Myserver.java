package JavaRmiPackege;
import java.rmi.*;
import java.rmi.registry.*;

public class Myserver {

	public static void main(String[] args) {
		try {
			//create a local instance of the object
			SampleServer server =new SampleServerImplementation();
			// put the local instance in the registry
			Naming .rebind("rmi://localhost:1099/Menge_rmi",server);
			} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
