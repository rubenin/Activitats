/** L'objectiu d'aquesta activitat és generar un programa que du a terme diferents
 * accions a partir d'una dada llegit pel teclat.
 *
 * Escriviu en un fitxer anomenat Termostat el codi en llenguatge Java que, en
 * funció del valor d'una temperatura, mostri un missatge per pantalla indicant
 * si cal encendre l'aire condicionat. Per exemple, si la temperatura val 25, el
 * missatge que es mostri hauria de ser "Activa l'aire condicionat." si la tempe-
 * ratura és de 18 graus, el missatge hauria de ser "Atura l'aire acondicionat."
 * Es considera que l'aire s'ha d'activar a partir dels 21 graus.
 */
package E2p2EstructurasDeSeleccio;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class E6Termostat {

    public static final double LIMIT = 21.0;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Quina temperatura fa? ");
        double temperatura = lector.nextDouble();
        lector.nextLine();

        if (temperatura >= LIMIT) {
            System.out.println("Activa l'aire condicionat. ");
        } else {
            System.out.println("Atura l'aire condicionat. ");
        }
    }
}
