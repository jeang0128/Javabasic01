
package clase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Servi {
    
    private int port;

    public Servi(int port) {
        this.port = port;
    }
    
    
    private void calculadora(PrintWriter out, BufferedReader in) throws IOException{
        
    out.println("servidor:::BiEnVeNiDo:::como te llamas?");
    
    String nombre = in.readLine();
    System.out.println(nombre);
    
    String operacion = in.readLine();
    Double operador1 = Double.parseDouble(in.readLine());
    Double operador2 = Double.parseDouble(in.readLine());
            
    if(operacion.equals("m")){
        out.println("servidor multiplica");
        out.println(operador1*operador2);
    
    }else if (operacion.equals("s")){
                out.println("servidor suma");
                out.println(operador1+operador2);
                
    }else if (operacion.equals("r")){
                out.println("servidor..resta");
                out.println(operador1-operador2);
    }else if (operacion.equals("d")){
                out.println("servidor divide");
                try {
                    out.println(operador1/operador2);
            
                } catch (Exception e) {
                    System.out.println("Error no existe la division por cero!!");
                    System.out.println("Excepcion: "+e.toString());
                }           
    }
  } 
}
