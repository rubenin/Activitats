/** L'objectiu d'aquesta activitat és aprendre a usar estructures de repetició
 * controlades mitjançant un acumulador.
 *
 * Feu un programa anometar SumarFinsLimit que llegeixi des del teclat un valor
 * enter i seguit mostri fins a quin punt de la seqüencia ordenada de nombre
 * positius (1, 2, 3, etc) cal sumar per arribar al nombre més proper per sota
 * d'aquest valor. Finalment, han de mostrar quina és la suma d'aquests nombres.
 * Per exemple, si l'entrada és el nombre 12, el resultat és mostrar els nombres
 * 0, 1, 2, 3, i 4, i la seva suma, que és 10, ja que si s'inclou el 5 ens passem
 * de 12.
 */
package E2p3EstructuresDeRepeticio;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class E7SumaFinsAUnLimit {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Quin és el valor límit? ");
        int valor = lector.nextInt();
        lector.nextLine();

        int acumulat = 0;
        int comptador = 0;

        while (acumulat < = valor) {
            acumulat = acumulat + comptador;
            if (acumulat < = valor) {
                System.out.println(comptador);
                comptador++;
            }
        }
        System.out.println("La suma dels valors positiu és " + (acumulat - comptador) + ".");
    }
}
