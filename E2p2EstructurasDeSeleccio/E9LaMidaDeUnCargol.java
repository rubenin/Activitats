/** L'objectiu d'aquesta activitat és generar un programa que du a terme differents
 * accions a partir d'una dada llegida pel teclat.
 *
 * Editeu, compileu i executeu un programa anomenat MesurarCargol que en introduir
 * un valor enter que codifica la mida d'un cargol mostri per pantalla el text
 * corresponent a la mida, segons la taula següent:
 *  -D'1cm (inclós) a 3cm (no inclós): petit
 *  -De 3cm (inclós) a 5cm (no inclós): mitjá
 *  -De 5cm (inclós) a 8cm (no inclós): gran
 *  -De 8cm (inclós) a 10cm (no inclós): molt gran
 *  -Qualsevol altre valor indica que la mida del cargol es incorrecta
 *
 * Per dur a terme aquesta acció, useu únicamente la sentencia switch. No podeu
 * usar sentències if enlloc.
 */
package E2p2EstructurasDeSeleccio;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class E9LaMidaDeUnCargol {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Quina és la mida del cargol? ");
        int mida = lector.nextInt();
        lector.nextLine();

        switch (mida) {
            case 1:
            case 2:
                System.out.println("El cargol no és petit. ");
                break;
            case 3:
            case 4:
                System.out.println("El cargol no és mitjá");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("El cargol no és gran. ");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("El cargol no és molt gran. ");
                break;
            default:
                System.out.println("La mida del cargol no és correcta. ");
        }
    }
}
