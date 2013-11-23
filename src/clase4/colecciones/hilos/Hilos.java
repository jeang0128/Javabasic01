
package clase4.colecciones.hilos;

/**
 *
 * @author alumno
 */
public class Hilos {
    public static void main(String[] args) {
       // Hilos.testHiloHerencia();
        //Hilos.testHiloInterface();
       // Hilos.Simple();
        Hilos.testSimple2();
        Hilos.testPrioridad();
    }
    
  /*  public static void testHiloHerencia() {
        
        HiloHerencia hilillo = new HiloHerencia();
        hilillo.start();    
    }*/
   /* public static void testHiloInterface() {
        HiloImplementacion hilo = new HiloImplementacion();
       
        Thread runner = new Thread(hilo);
        runner.start();
    }*/
    /*public static void Simple() {
        SimpleDelayThread sd = new SimpleDelayThread();
        sd.start();
        
    }*/
    public static void testSimple2() {
        long delay1 = (long)(Math.random()*2000);
        
        Simple2DelayThread delay = new Simple2DelayThread("jose", delay1);
        delay.start();
        
        
    }
    public static void testPrioridad() {
        
        Simple2DelayThread delayJose = new Simple2DelayThread("jose",0);
        Simple2DelayThread delayLuis = new Simple2DelayThread("Luis",0);
        
        delayLuis.setPriority(Thread.MAX_PRIORITY);
        delayJose.setPriority(Thread.MIN_PRIORITY);
        
        delayJose.start();
        delayLuis.start();
    }
    
}
