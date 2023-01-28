/** L'objectiu d'aquesta activitat és aprendre a usar estructures de repetició per
 * recórrer intervals de valors.
 *
 * Feu un programa anometat MostraInterval que llegeixi des del teclat dos valors
 * enters n1 i n2, comprovi que amb n1 < n2 (i mostri un error si no és així),
 * i finalment escrigui tots els nombres enters dins l'interval[n1 , n2] en ordre
 * creixent.
 */
package E2p3EstructuresDeRepeticio;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class E2IntervalDeValors {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print("Quin és el valor de n1? ");
        int n1 = lector.nextInt();
        lector.nextLine();

        System.out.print("Quin és el valor de n2 (més gran que n1)? ");
        int n2 = lector.nextInt();
        lector.nextLine();

        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("n2 no és més gran que n1!");
        }
    }
}
