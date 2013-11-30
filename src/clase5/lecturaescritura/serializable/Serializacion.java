package clase5.lecturaescritura.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion {

    public static void main(String[] args) {
        Serializacion.serializarPersona();
        Serializacion.desSerializarPersona();
    }

    public static void serializarPersona() {
        ObjectOutputStream salida = null;

        Persona persona = new Persona("David", 23);
        try {
            FileOutputStream archivo = new FileOutputStream("C:\\ejmplo.txt");
            salida = new ObjectOutputStream(archivo);
            salida.writeObject(persona);
            salida.flush();
        } catch (IOException e) {
            System.out.println("Imposible crear el archivo o escribir en él");
        } finally {
            try {
                salida.close();
            } catch (IOException e) {
                System.out.println("No pudo cerrarse el canal");
            }
        }
    }

    public static void desSerializarPersona() {

        File archivo = new File("C://ejmplo.txt");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Persona persona = (Persona) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Persona recuperada: " + persona.toString());
        } catch (IOException e) {
            System.err.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.err.println(e.toString());
        }
    }
}