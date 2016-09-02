/*
 * Universidad de las Americas, A.C.
 * Licenciatura en Informatica y Tecnologias de la Informacion.
 * Ricardo Meneses Pardo
 * 77148
 */
package Parcial1;

import java.io.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
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
public class ValidacionB
{
    
    @Rule
    public GuardaCR gc = new GuardaCR();
    @Rule
    public CargaCR cc = new CargaCR();

    private String palabra;
    private String expected;
    private static Cifrado clase;
    private static String[] palabras;

    @Before
    public void before() throws IOException
    {
        clase = new Cifrado();
        palabras = cc.palabras;
        generaArchivo();
        
    }

    public ValidacionB(String palabra, String expected) {
        this.palabra = palabra;
        this.expected = expected;
    }
    
    @Parameterized.Parameters
    public static Collection palabrasPrueba()
    {
        
        String[][] lista = new String[100][2];
        for (Integer i = 0; i < 100; i++) {
            
            lista[i][0] = palabras[i];
            lista[i][1] = clase.descifrar(palabras[i], 3);
        }
        
        return Arrays.asList(lista);
    }
    
    @Test
    public void tstCifrado()
    {
        System.out.println("la palabra probada fue " + palabra + " ");
        assertEquals("error en la palabra " + palabra, expected, clase.descifrar(palabra, 3));
    }
    
    public void generaArchivo() throws IOException
    {
        File f = new File("Resultado.txt");  
        FileWriter w = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(w);
        PrintWriter wr = new PrintWriter(bw);
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        wr.append(output);
        wr.close();
        bw.close();
    }
}
