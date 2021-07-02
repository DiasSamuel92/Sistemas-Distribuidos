import java.net.MalformedURLException;
import java.rmi.*;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        exception(Exception.class, (e, req, res) -> e.printStackTrace()); // print all exceptions
        port(8081);
        String addressServerA = "rmi://localhost:10999";
        CalcA basico = (CalcA)Naming.lookup(addressServerA+"/CalcAServer");
        String addressServerB = "rmi://localhost:10998";
        CalcB avancado = (CalcB)Naming.lookup(addressServerB+"/CalcBServer");

        post("/somar", (req, res) ->{
            try {
                int num1 = Integer.parseInt(req.queryParams("num1"));
                int num2 = Integer.parseInt(req.queryParams("num2"));
                return basico.somar(num1,num2);
            } catch (Exception e) {
                return "Valores invalidos! Informe dois numeros (num1 e num2)!";
            }
        });
        post("/subtrair", (req, res) ->{
            try {
                int num1 = Integer.parseInt(req.queryParams("num1"));
                int num2 = Integer.parseInt(req.queryParams("num2"));
                return basico.subtrair(num1,num2);
            } catch (Exception e) {
                return "Valores invalidos! Informe dois numeros (num1 e num2)!";
            }
        });
        post("/dividir", (req, res) ->{
            try {
                int num1 = Integer.parseInt(req.queryParams("num1"));
                int num2 = Integer.parseInt(req.queryParams("num2"));
                return basico.dividir(num1,num2);
            } catch (Exception e) {
                return "Valores invalidos! Informe dois numeros (num1 e num2)!";
            }
        });
        post("/multiplicar", (req, res) ->{
            try {
                int num1 = Integer.parseInt(req.queryParams("num1"));
                int num2 = Integer.parseInt(req.queryParams("num2"));
                return basico.multiplicar(num1,num2);
            } catch (Exception e) {
                return "Valores invalidos! Informe dois numeros (num1 e num2)!";
            }
        });

        post("/porcentagem", (req, res) ->{
            try {
                int num1 = Integer.parseInt(req.queryParams("num1"));
                int num2 = Integer.parseInt(req.queryParams("num2"));
                return avancado.porcentagem(num1,num2);
            } catch (Exception e) {
                return "Valores invalidos! Informe dois numeros (num1 e num2)!";
            }
        });
        post("/raiz", (req, res) ->{
            try {
                int num1 = Integer.parseInt(req.queryParams("num1"));
                int num2 = Integer.parseInt(req.queryParams("num2"));
                return avancado.raiz(num1,num2);
            } catch (Exception e) {
                return "Valores invalidos! Informe dois numeros (num1 e num2)!";
            }
        });
        post("/potencia", (req, res) ->{
            try {
                int num1 = Integer.parseInt(req.queryParams("num1"));
                int num2 = Integer.parseInt(req.queryParams("num2"));
                return avancado.potencia(num1,num2);
            } catch (Exception e) {
                return "Valores invalidos! Informe dois numeros (num1 e num2)!";
            }
        });
    }

}
