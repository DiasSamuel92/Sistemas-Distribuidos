/**
 * Created by thomas on 19/05/17.
 */
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerB {
    public static void main (String args [ ]) {
        //Cria e instala o security manager
        //System.setSecurityManager(new RMISecurityManager() );
        try {
            //Cria HelloImpl
            Registry registry = LocateRegistry.createRegistry(10998);
            CalcBImpl calcB = new CalcBImpl();
            registry.rebind("CalcBServer",calcB);

            System.out.println("Server B pronto");
        } catch(Exception e) {
            System.out.println("Server B erro" + e.getMessage());
        }
    }
}
