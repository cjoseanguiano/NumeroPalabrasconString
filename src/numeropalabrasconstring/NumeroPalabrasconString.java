/*
Como alternativa a utilizar la clase StringTokenizer, 
podemos resolverlo utilizando solo los métodos de la clase String. 
En este caso se tratará de buscar los espacios en blanco dentro de la cadena y 
contarlos.

 */
package numeropalabrasconstring;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class NumeroPalabrasconString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String valorPalabra;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la palabras");
        valorPalabra = entrada.nextLine();
//        contador(valorPalabra);
        System.out.println(contador(valorPalabra));
    }

    public static int contador(String s) {
        s = s.trim();
        int contador = 1;
        int espacio;
        if (s.isEmpty()) {
            contador = 0;
        } else {
            espacio = s.indexOf(" ");
            while (espacio != -1) {
                contador++;
                espacio = s.indexOf(" ", espacio + 1);
            }
        }

        return contador;
    }

}
