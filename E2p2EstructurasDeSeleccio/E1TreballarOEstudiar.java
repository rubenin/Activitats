/** L'objectiu d'aquesta activitat és aprendre a predir quin codi s'executarà
 * donada una estructura de selecció.
 *
 * Avalueu el codi en Java següent. Quin resultat mostrará per pantalla? Quins
 * valors hauria de tenir la variable edat perquè generés el missatge " Vols
 * treballar o estudiar?.
 */
package E2p2EstructurasDeSeleccio;

/**
 *
 * @author ruben
 */
public class E1TreballarOEstudiar {

    public static void main(String[] args) {
        int m = 16;
        int n = 5;
        int edat = 12;
        if ((edat > n) && (edat < m)) {
            System.out.println("Has d'anar a l'escola. ");
        } else {
            System.out.println("Vols treballar o estudiar?");
        }
    }
}
