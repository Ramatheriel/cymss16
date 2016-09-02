/*
 * Universidad de las Americas, A.C.
 * Licenciatura en Informatica y Tecnologias de la Informacion.
 * Ricardo Meneses Pardo
 * 77148
 */
package Parcial1;

import java.io.BufferedReader;
import java.io.FileReader;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author Ricardo
 */
public class CargaCR implements TestRule
{
    String[] palabras;
    
    @Override
    public Statement apply(Statement stmnt, Description d) 
    {
        return new MyStatement(stmnt);
        
    }
    
    class MyStatement extends Statement
    {
        private final Statement stmnt;
        
        MyStatement(Statement stmnt)
        {
            this.stmnt = stmnt;
        }
        
        @Override
        public void evaluate() throws Throwable
        {
            try(BufferedReader br = new BufferedReader(new FileReader("Carga.txt"))) {
                palabras = new String[100];
                
                for (int i = 0; i < 100; i++)
                {
                    String line = br.readLine();
                    palabras[i] = line;
                }
                stmnt.evaluate();
            }
        }
    }
}
