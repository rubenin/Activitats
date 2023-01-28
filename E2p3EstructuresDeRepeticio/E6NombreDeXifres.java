/** L'objectiu d'aquesta activitat és aprendre a usar estructures de repetició
 * basades en un acumulador.
 *
 * Feu un programa anomenat ComptaXifres que llegeixi un nombre enter des del teclat
 * i escrigui el nombre de xifres que té. Tingueu en compte que es considera que
 * el valor 0 té una xifra.
 */
package E2p3EstructuresDeRepeticio;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class E6NombreDeXifres {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Quin és el valor per analitzar?");
        int valor = lector.nextInt();
        lector.nextLine();
        int numXifres = 0;

//valor actúa com acumulador descendent.
        do {
            valor = valor / 10;
            numXifres++;
        } while (valor != 0);
        System.out.println("El nombre de xifres és " + numXifres + ".");
    }
}
