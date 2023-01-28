/** L'objectiu d'aquesta activitat és generar un programa que discrimina valors usant
 * una estructura de selecció.
 *
 * Creeu un programa anomenat EsPositiu que decideixi si un nombre enter és positiu,
 * negatiu o zero. Quan sigui positiu ha d'escriure a la pantalla "Positiu", quan
 * sigui negatiu, el programa ha d'escriure "Negatiu" i quan sigui zero, ha d'escriure
 * "Zero". El nombre s'ha de definir com una constant.
 */
package E2p2EstructurasDeSeleccio;

/**
 *
 * @author ruben
 */
public class E5EsPositiu {

    public static final int VALOR = 10;

    public static void main(String[] args) {

        if (VALOR > 0) {
            System.out.println("Positiu. ");
        } else if (VALOR < 0) {
            System.out.println("Negatiu. ");
        } else {
            System.out.println("Zero. ");
        }
    }
}
