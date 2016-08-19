/*
 * Universidad de las Americas, A.C.
 * Licenciatura en Informatica y Tecnologias de la Informacion.
 * Ricardo Meneses Pardo
 * 77148
 */
package ParameterizedTest;

import helpers.PerfectNaturals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Ricardo
 */
@RunWith(Parameterized.class)
public class TestPerfectNaturals {

        private Integer num;
        private Boolean expected;
        private PerfectNaturals clase;

    @Before
    public void inicializa()
    {;
        clase = new PerfectNaturals();
    }

    public TestPerfectNaturals(Integer num, Boolean expected) {
        this.num = num;
        this.expected = expected;
    }
    
    @Parameters
    public static Collection perfectNumbers2Test()
    {
      Object[][] lista = new Object[100000][2];
        for (Integer i = 0; i < 10; i++) {
            lista[i][0] = i;
            lista[i][1] = false;
        }
        
        return Arrays.asList(lista);
    }
    
    @Test
    public void testPerfectNaturals()
    {
        System.out.println("el numero probado " + num + " ");
        assertEquals("error en el número " + num, expected, clase.isPerfect(num));
    }
}
