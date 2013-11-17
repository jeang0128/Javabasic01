
package clase4.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Colecciones {
    
    public static void main(String[] args) {
      
       Colecciones.ejemploEstudiantes();
      // Estudiante e = new Estudiante(null, null);
      //Colecciones.ejemploLinkedList
    } 
    
    public static void ejemploEstudiantes() {
        
     Estudiante jesus= new Estudiante("jebus", "allca rubi");
     Estudiante jose= new Estudiante("jose", "tubi rubios");
     Estudiante mariana= new Estudiante("rina", "jica hoyos");
     Estudiante ana = new Estudiante("ana", "nopo lila");
     Estudiante paula= new Estudiante("paula", "jum meida");
     
        List<Estudiante> listado = new ArrayList<Estudiante>();
        listado.add(ana);
        listado.add(jose);
        listado.add(jesus);
        listado.add(mariana);
        listado.add(paula);
        
        listado.get(1);//acceder al 1er elemento
        
        Collections.sort(listado);
        
        for (Estudiante e : listado) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
            
        }
    }
 }

