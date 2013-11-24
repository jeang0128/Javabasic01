package clase5.lecturaescritura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscritura {

    public static void main(String[] args) {
        
        LecturaEscritura.escribirArchivo();
        LecturaEscritura.LeerArchivo();
    }

    public static void escribirArchivo() {
        try {
            FileWriter fw = new FileWriter("C:\\javaTecsup\\ejmplo");
            BufferedWriter bw = null;
            //fw = new FileWriter("/home/alumno/test");
            bw = new BufferedWriter(fw);
            bw.write("Es una linea");
            bw.newLine();
            bw.write("Es otra linea");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void LeerArchivo() {
        String sInput;
        try {
            FileReader fr = new FileReader("C:\\javaTecsup\\ejmplo");
            BufferedReader br = new BufferedReader(fr);
            //fw = new FileWriter("/home/alumno/test");
            //br = new BufferedReader(f);
            //br.write("Es una linea");
            //  br.newLine();
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
