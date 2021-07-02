import java.rmi.*;
import java.util.Date;

public interface CalcA extends Remote {
    int somar(int a,int b) throws RemoteException;
    int subtrair(int a,int b) throws RemoteException;
    int dividir(int a,int b) throws RemoteException;
    int multiplicar(int a,int b) throws RemoteException;
}
