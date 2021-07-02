import java.rmi.*;
import java.util.Date;

public interface CalcB extends Remote {
    double porcentagem(int a,int b) throws RemoteException;
    double raiz(int a,int b) throws RemoteException;
    double potencia(int a,int b) throws RemoteException;
}
