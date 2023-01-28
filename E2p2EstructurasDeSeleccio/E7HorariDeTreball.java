/** L?objectiu d'aquesta activitat és generar un programa que du a terme diferents
 * accions a partir d'una dada llegida pel teclat.
 *
 * Escriviu en un fitxer anomenat "HorariDeTreball" el codi en llenguatge Java que,
 * a partir d'un valor enter amb l'hora del dia llegit pel teclat, mostri un
 * missatge per pantalla que indiqui si és l'hora de treballar. Es considera que
 * l'horari de feina és de 9 a 17h. L'hora d'inici(9) es considera de treball,
 * pero no la de fi. Per exemple, si l´hora val 9, el missatge que es mostri
 * hauria de ser "Treball". si l'hora és les 21, el missatge hauria de ser "Temps
 * lliure". No cal preveure els minuts, només l´hora.
 *
 * Abans de fer res, aquest programa ha de controlar si el valor que ha entrat
 * l'usuari és correcte(Es comprén entre les 0 i les 23h). Si no és el cas, cal
 * mostrar un missatge d'error.
 */
package E2p2EstructurasDeSeleccio;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class E7HorariDeTreball {

    public static final int HORA_INICI = 9;
    public static final int HORA_FI = 17;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Quina hora és? ");
        int hora = lector.nextInt();
        lector.nextLine();

        if ((hora > 23) || (hora < 0)) {
            System.out.println("L'hora és incorrecta. ");
        } else {
            System.out.println("Temps lliure. ");
        }
    }
}
