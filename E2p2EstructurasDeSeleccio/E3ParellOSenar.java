/** L'objectiu d'aquesta activitar ès generar un programa que discrimina valors
 * usant una estructura de selecció.
 * Creeu un programa anometar ParellOSenar que decideixi si un nombre enter és parell
 * o senar. Quan sigui parell ha d'escriure a la pantalla "Parell", i quan sigui
 * senar, el programa ha d'escriure a la pantalla "Senar". El nombre per discriminar
 * l'heu de declarar com una constant anomenada "VALOR".
 */
package E2p2EstructurasDeSeleccio;

/**
 *
 * @author ruben
 */
public class E3ParellOSenar {

    public static final int VALOR = 10;

    public static void main(String[] args) {
        if (VALOR % 2 == 0) {
            System.out.println("Parell.");
        } else {
            System.out.println("Senar.");
        }
    }

}
