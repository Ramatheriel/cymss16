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
public class TimeTestRule 
{
    
    
    @Rule
    public CustomRule r = new CustomRule();
    
    @Test
    public void casoDePrueba1()
    {
        long tiempoInicio = System.currentTimeMillis();
        assertEquals("son iguales", 5, 5);
        for(int i = 0; i < 1000000; i++)
        {
            
        }
        long totalTiempo = System.currentTimeMillis() - tiempoInicio;
        System.out.println("El tiempo de demora es :" + totalTiempo + " miliseg");
    }
    
    @Test
    public void casoDePrueba2()
    {
        long tiempoInicio = System.currentTimeMillis();
        assertNull("es nulo", null);
        for(int i = 0; i < 2000000; i++)
        {
            
        }
        long totalTiempo = System.currentTimeMillis() - tiempoInicio;
        System.out.println("El tiempo de demora es :" + totalTiempo + " miliseg");
    }
    
    @Test
    public void casoDePrueba3()
    {
        long tiempoInicio = System.currentTimeMillis();
        assertTrue("es verdad que van a reprobar", true);
        long totalTiempo = System.currentTimeMillis() - tiempoInicio;
        System.out.println("El tiempo de demora es :" + totalTiempo + " miliseg");
    }
    
    public TimeTestRule() {
    }
    
}