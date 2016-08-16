/*
 * Universidad de las Americas, A.C.
 * Licenciatura en Informatica y Tecnologias de la Informacion.
 * Ricardo Meneses Pardo
 * 77148
 */
package CustomRules;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author Ricardo
 */
public class CustomRule implements TestRule
{

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
            try
            {
                System.out.println("Esta prueba fue hecha por mi");
                stmnt.evaluate();
            }
            finally
            {
                System.out.println("La prueba termino");
            }
        }
    }
}
