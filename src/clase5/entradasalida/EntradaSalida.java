package clase5.entradasalida;

import java.io.File;

public class EntradaSalida {

    public static void main(String[] args) {
        //EntradaSalida.verifyFile();
       // EntradaSalida.listarDirectorio();
       EntradaSalida.createDirectorio();
    }

    public static void verifyFile() {

        File file = new File("C:\\file.txt");

        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta : " + file.getPath());
        System.out.println("Ruta Absoluta: " + file.getAbsolutePath());

        if (file.exists()) {
            System.out.println("Archivo sí existe!");
            System.out.println((file.canRead()) ? "Sí se puede leer" : "");
            System.out.println((file.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + file.length() + " bytes");
        } else {
            System.out.println("El archivo no existe");
        }
    }

    public static void listarDirectorio() {
        File dir = new File("C:\\");

        if ((dir.exists()) && (dir.isDirectory())) {
            String[] lista = dir.list();
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }
    
    public static void createDirectorio() {
        
        File dir = new File("C:\\javaTecsup");
        if (!dir.isDirectory() && !dir.exists()){
         dir.mkdir();
        }
    }
    
   
}
