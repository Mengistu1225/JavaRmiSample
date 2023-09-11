package JavaRmiPackege;
import java.rmi.*;
public class Myclient {

	public static void main(String[] args) {
		// get the remote object from the registry
		try {
			String url="rmi://localhist:1099/menge_rmi";
			SampleServer remoteObject=(SampleServer)Naming.lookup(url);
			System.out.println("the remote object are accessed");
			System.out.println("20+30 = "+ remoteObject.add(20,30));
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
