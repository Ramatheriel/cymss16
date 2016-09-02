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
public class Cifrado 
{
    public String cifrar(String cadena, int consanteDesplazamiento) {
        StringBuilder cifrado = new StringBuilder();
        consanteDesplazamiento = consanteDesplazamiento % 26;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') {
                if ((cadena.charAt(i) + consanteDesplazamiento) > 'z') {
                    cifrado.append((char) (cadena.charAt(i) + consanteDesplazamiento - 26));
                } else {
                    cifrado.append((char) (cadena.charAt(i) + consanteDesplazamiento));
                }
            } else if (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z') {
                if ((cadena.charAt(i) + consanteDesplazamiento) > 'Z') {
                    cifrado.append((char) (cadena.charAt(i) + consanteDesplazamiento - 26));
                } else {
                    cifrado.append((char) (cadena.charAt(i) + consanteDesplazamiento));
                }
            }
        }
        return cifrado.toString();
    }

    public String descifrar(String cadena, int consanteDesplazamiento) {
        StringBuilder cifrado = new StringBuilder();
        consanteDesplazamiento = consanteDesplazamiento % 26;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') {
                if ((cadena.charAt(i) - consanteDesplazamiento) < 'a') {
                    cifrado.append((char) (cadena.charAt(i) - consanteDesplazamiento + 26));
                } else {
                    cifrado.append((char) (cadena.charAt(i) - consanteDesplazamiento));
                }
            } else if (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z') {
                if ((cadena.charAt(i) - consanteDesplazamiento) < 'A') {
                    cifrado.append((char) (cadena.charAt(i) - consanteDesplazamiento + 26));
                } else {
                    cifrado.append((char) (cadena.charAt(i) - consanteDesplazamiento));
                }
            }
        }
        return cifrado.toString();
    }    
    
    public char cifrar(char letra, int consanteDesplazamiento) {
        char cifrado;
        consanteDesplazamiento = consanteDesplazamiento % 26;
        cifrado = (char) (letra + consanteDesplazamiento - 26);
        
        return cifrado;
    }

    public char descifrar(char letra, int consanteDesplazamiento) {
        char cifrado;
        consanteDesplazamiento = consanteDesplazamiento % 26;
        cifrado = (char) (letra + consanteDesplazamiento + 26);
        
        return cifrado;
    }
}

