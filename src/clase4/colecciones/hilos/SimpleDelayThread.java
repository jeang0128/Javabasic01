
package clase4.colecciones.hilos;


public class SimpleDelayThread extends Thread{

    @Override
    public void run() {
        //super.run(); 
        for (int i = 0; i <50; i++) {
                
            System.out.println(i);
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException ex) {
                System.out.println("ErRoR : "+ex.getMessage());
            }
        }
//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
