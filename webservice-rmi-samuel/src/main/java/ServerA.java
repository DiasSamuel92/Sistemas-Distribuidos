/**
 * Created by thomas on 19/05/17.
 */
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerA {
    public static void main (String args [ ]) {
        //Cria e instala o security manager
        //System.setSecurityManager(new RMISecurityManager() );
        try {
            //Cria HelloImpl
            Registry registry = LocateRegistry.createRegistry(10999);
            CalcAImpl calcA = new CalcAImpl();
            registry.rebind("CalcAServer",calcA);

            System.out.println("Server A pronto");
        } catch(Exception e) {
            System.out.println("Server A erro" + e.getMessage());
        }
    }
}
