
package clase4.colecciones.hilos;

public class HiloHerencia extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }    
}
