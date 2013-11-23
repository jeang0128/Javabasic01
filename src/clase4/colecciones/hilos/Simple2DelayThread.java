
package clase4.colecciones.hilos;


public class Simple2DelayThread extends Thread{
    
    private long delay;
    private String  nombre;

    public Simple2DelayThread(String nombre, long delay){
        this.delay = delay;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("nombre "+nombre+" Delay : "+ delay);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
                e.printStackTrace();
                }
        }
    }
    
    
    
    
}
