package clase6.unit;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MultiplicacionTest {

    @Test
    public void testMultiplication() {
        assertEquals("Multiplication", 6, 3 * 2);}
    
    public void testDivisa() throws Exception{
        
        System.out.println(" SUMAR DIVISAS");
        
        Divisa divisaUno = new Divisa (10, "soles");
        Divisa divisaDos = new Divisa (20, "soles");
        Divisa divisaTres = new Divisa (30, "soles");
        
        Divisa divisaResultado = divisaDos.sumar(divisaUno);
        assertEquals(divisaEsperada.getImporte(), divisaResultado.getImporte());
      }

    private void assertEquals(String multiplication, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

