/*
 * Universidad de las Americas, A.C.
 * Licenciatura en Informatica y Tecnologias de la Informacion.
 * Ricardo Meneses Pardo
 * 77148
 */
package CustomRules;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author Ricardo
 */
public class TestCustomRule 
{
    @Rule
    public CustomRule r = new CustomRule();
    
    @Test
    public void casoDePrueba1()
    {
        assertEquals("son iguales", 5, 5);
    }
    
    @Test
    public void casoDePrueba2()
    {
        assertNull("es nulo", null);
    }
    
    @Test
    public void casoDePrueba3()
    {
        assertTrue("es verdad que van a reprobar", true);
    }
    
    public TestCustomRule() {
    }
    
}
