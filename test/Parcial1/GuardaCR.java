/*
 * Universidad de las Americas, A.C.
 * Licenciatura en Informatica y Tecnologias de la Informacion.
 * Ricardo Meneses Pardo
 * 77148
 */
package Parcial1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author Ricardo
 */
public class GuardaCR implements TestRule
{
    File f;  
    FileWriter w;
    BufferedWriter bw;
    PrintWriter wr;
    
    @Override
    public Statement apply(Statement stmnt, Description d) 
    {
        return new MyStatement(stmnt, d);
        
    }
    
    class MyStatement extends Statement
    {
        private final Statement stmnt;
        private final Description d;
        
        MyStatement(Statement stmnt, Description d)
        {
            this.stmnt = stmnt;
            this.d = d;
        }
        
        @Override
        public void evaluate() throws Throwable
        {
            try
            {
                f = new File("Resultado.txt");
                w = new FileWriter(f);
                bw = new BufferedWriter(w);
                wr = new PrintWriter(bw);
                String output = stmnt.toString();
                String outputB = d.toString();
                wr.append(output);
                wr.append(outputB);
                wr.close();
                bw.close();
            }
            finally
            {
                System.out.println("La prueba termino");
            }
        }
    }
}
