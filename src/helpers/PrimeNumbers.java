/*
 * Universidad de las Americas, A.C.
 * Licenciatura en Informatica y Tecnologias de la Informacion.
 * Ricardo Meneses Pardo
 * 77148
 */
package helpers;

/**
 *
 * @author Ricardo
 */
public class PrimeNumbers 
{
    
    public Boolean isPrime(Integer num)
    {
        
        for (int i = 2; i < (num/2); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
       
    
}


