import java.rmi.*;
import java.rmi.server.*;

public class CalcAImpl extends UnicastRemoteObject implements CalcA {

    public CalcAImpl() throws RemoteException{
        super();
    }
    public int somar(int a,int b) { return a+b; }
    public int subtrair(int a,int b) { return a-b; }
    public int dividir(int a,int b) { return a/b; }
    public int multiplicar(int a,int b) { return a*b; }

}
