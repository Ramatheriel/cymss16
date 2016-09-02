/*
 * Universidad de las Americas, A.C.
 * Licenciatura en Informatica y Tecnologias de la Informacion.
 * Ricardo Meneses Pardo
 * 77148
 */
package Parcial1;

import org.junit.Test;
import static org.junit.Assert.*;
import helpers.Cifrado;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Ricardo
 */
@RunWith(Parameterized.class)
public class ValidacionC
{
    
    private static char letra;
    private char expected;
    private static Cifrado clase;
    @Before
    public void before()
    {
        clase = new Cifrado();   
        
    }

    public ValidacionC(char palabra, char expected) {
        this.letra = palabra;
        this.expected = expected;
    }
    
    @Parameterized.Parameters
    public static Collection palabrasPrueba()
    {
        Random r = new Random();
        
        char[][] lista = new char[100][2];
        for (Integer i = 0; i < 100; i++) {
            letra = (char)(r.nextInt(26) + 'a');
            lista[i][0] = letra;
            lista[i][1] = (char) (letra + 3);
        }
        
        return Arrays.asList(lista);
    }
    
    @Test
    public void tstCifrado()
    {
        System.out.println("la letra probada fue " + letra + " ");
        assertEquals("error en la palabra " + letra, expected, clase.cifrar(letra, 3));
    }
}

