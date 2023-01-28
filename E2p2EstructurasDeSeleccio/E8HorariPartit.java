/** L'objectiu d'aquesta activitat és generar un programa que du a terme diferents
 * accions a partir d'una dada llegida pel teclat.
 *
 * Modifiqueu l'exercisi anterior perqué prevegi que l'horari és de 9 a 14 i de 16
 * a 19h. Cal tenir en compte que les 14 és l'hora de dinar, i per tant és temps
 * lliure.
 */
package E2p2EstructurasDeSeleccio;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class E8HorariPartit {

    public static final int HORA_INICI_MATI = 9;
    public static final int HORA_FI_MATI = 14;
    public static final int HORA_INICI_TARDA = 16;
    public static final int HORA_FI_TARDA = 19;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Quina hora és? ");
        int hora = lector.nextInt();
        lector.nextLine();

        if ((hora > 23) || (hora < 0)) {
            System.out.println("L'hora és incorrecta. ");
        } else {
            if (((hora >= HORA_INICI_MATI) && (hora < HORA_FI_MATI)) || ((hora >= HORA_INICI_TARDA) && (hora < HORA_FI_TARDA))) {
                System.out.println("Treball. ");
            } else {
                System.out.println("Temps lliure. ");
            }
        }
    }
}
