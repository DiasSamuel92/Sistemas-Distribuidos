import java.rmi.*;
import java.rmi.server.*;

public class CalcBImpl extends UnicastRemoteObject implements CalcB {

    public CalcBImpl() throws RemoteException{
        super();
    }
    public double porcentagem(int a,int b) { return (double) (a*b)/100; }
    public double raiz(int a,int b) { return Math.pow(a,1.0/b); }
    public double potencia(int a,int b) { return Math.pow(a,b); }

}
