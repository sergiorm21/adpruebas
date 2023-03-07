package calculadora;

import static java.lang.String.valueOf;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author sergi
 */
public class CalculandoTest {
    
    public CalculandoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculando.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double a = 0.0;
        double b = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.add(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Calculando.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double a = 0.0;
        double b = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.subtract(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculando.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double a = 0.0;
        double b = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.multiply(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculando.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double a = 0.0;
        double b = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.divide(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public void TestRecuperacion(){
        Main main = new Main();
        assertEquals(2, main.pruebaRecuperacionEntradaString("uno", valueOf(2)), 0.0);
    }
}
