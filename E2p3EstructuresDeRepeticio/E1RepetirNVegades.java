/** L'objectiu d'aquesta activitat és entendre què farà un programa basat en
 * estructures de repetició estudiant el seu font.
 *
 * Observeu el codi font següent. Què fa el programa? Què sortirà escrit a la
 * pantall?
 */
package E2p3EstructuresDeRepeticio;

/**
 *
 * @author ruben
 */
public class E1RepetirNVegades {

    public static final int VALOR = 25;

    public static void main(String[] args) {

        int n = 0;
        for (int i = 1; i < VALOR; i++) {
            if (i % 10 == 0) {
                n++;
            }
        }
        System.out.println("El resultat és " + n + ".");
    }
}
