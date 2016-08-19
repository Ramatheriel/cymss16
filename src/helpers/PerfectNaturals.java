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
public class PerfectNaturals
    {
        public Boolean isPerfect(Integer num)
        {
            int result = 0;
        
            for (int i = 1; i < (num/2); i++)
            {
                if(num %i == 0)
                {
                    result = result + i;
                }
                       
            }
            
            return (result==num) ? true:false;
        
        }
    }
