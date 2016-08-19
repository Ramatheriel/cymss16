/*
 * Universidad de las Americas, A.C.
 * Licenciatura en Informatica y Tecnologias de la Informacion.
 * Ricardo Meneses Pardo
 * 77148
 */
package ParameterizedTest;

import helpers.PrimeNumbers;
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
public class TestPrimes {

        private Integer num;
        private Boolean expected;
        private PrimeNumbers clase;

    @Before
    public void before()
    {
        clase = new PrimeNumbers();
    }

    public TestPrimes(Integer num, Boolean expected) {
        this.num = num;
        this.expected = expected;
    }
    
    @Parameters
    public static Collection primeNumbers2Test()
    {
        return Arrays.asList(new Object[][]
        {
            {-3,true },
            {0,true},
            {5,true},
            {7,true},
            {9,false},
        });
    }
    
    @Test
    public void tstPrimeNumbers()
    {
        System.out.println("el numero probado " + num + " ");
        assertEquals("error en el número " + num, expected, clase.isPrime(num));
    }
}
