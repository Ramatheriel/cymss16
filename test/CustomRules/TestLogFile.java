/*
 * Universidad de las Americas, A.C.
 * Licenciatura en Informatica y Tecnologias de la Informacion.
 * Ricardo Meneses Pardo
 * 77148
 */
package CustomRules;

import java.io.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author Ricardo
 */
public class TestLogFile 
{
    File f;  
    FileWriter w;
    BufferedWriter bw;
    PrintWriter wr;
    
    public TestLogFile() 
    {

    }
    
    @Rule
    public CustomRule r = new CustomRule();
    
    @Test
    public void casoDePrueba1()
    {
        try
        {
            f = new File("Holi.txt");
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            long tiempoInicio = System.currentTimeMillis();
            assertEquals("son iguales", 5, 5);
            for(int i = 0; i < 1000000; i++)
            {
            
            }
            long totalTiempo = System.currentTimeMillis() - tiempoInicio;
            System.out.println("El tiempo de demora es :" + totalTiempo + " miliseg ");
            wr.append("Caso de Prueba 1: " + totalTiempo + " miliseg ");
            wr.close();
            bw.close();
        }
        catch(IOException e)
        {
        
        };
    }
    
    @Test
    public void casoDePrueba2()
    {
        try
        {
            f = new File("Holi.txt");
            w = new FileWriter(f,true);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            long tiempoInicio = System.currentTimeMillis();
            assertNull("es nulo", null);
            for(int i = 0; i < 2000000; i++)
            {
            
            }
            long totalTiempo = System.currentTimeMillis() - tiempoInicio;
            System.out.println("El tiempo de demora es :" + totalTiempo + " miliseg");
            wr.append("Caso de Prueba 2: " + totalTiempo + " miliseg ");
            wr.close();
            bw.close();
        }
        catch(IOException e)
        {
        
        };
    }
    
    @Test
    public void casoDePrueba3()
    {
        
        try
        {
            f = new File("Holi.txt");
            w = new FileWriter(f,true);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            long tiempoInicio = System.currentTimeMillis();
            assertTrue("es verdad que van a reprobar", true);
            long totalTiempo = System.currentTimeMillis() - tiempoInicio;
            System.out.println("El tiempo de demora es :" + totalTiempo + " miliseg");
            wr.append("Caso de Prueba 3: " + totalTiempo + " miliseg ");
            wr.close();
            bw.close();
        }
        catch(IOException e)
        {
        
        };

    }
    
}
