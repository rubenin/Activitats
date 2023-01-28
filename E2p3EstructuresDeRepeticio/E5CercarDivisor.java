/** L'objectiu d'aquesta activitat és aprendre a usar estructures de repetició per
 * cercar valors concrest dins d'un rang.
 *
 * Feu un programa anomenat CercarDivisor que llegeixi des del teclat un nombre
 * enter positiu major que 1 i n'escrigui el divisor positiu més gran diferent
 * d'ell mateix i d'1. En cas de no trobar-ne cap, cal anunciar aquest fet amb un
 * text. Per fer-ho, useu una variable de control de tipus semàfor.
 */
package E2p3EstructuresDeRepeticio;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class E5CercarDivisor {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

//Solicitamos el número a analizar        
        System.out.print("Quin nombre vols analitzar? ");
        int valor = lector.nextInt();
        lector.nextLine();

//Creamos el booleano
        boolean trobat = false;
        int divisor = valor - 1;

        while ((!trobat) && (divisor > 1)) {
            if ((valor % divisor) == 0) {
                trobat = true;
            } else {
                divisor--;
            }
        }
        if (divisor == 1) {
            System.out.println("No s'ha trobat cap divisor. ");
        } else {
            System.out.println("El divisor és " + divisor + ".");
        }
    }
}
