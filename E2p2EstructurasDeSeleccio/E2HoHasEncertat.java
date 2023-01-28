/** L'objectiu d'aquesta activitat és aprendre a predir quin codi s'executará
 * donada una estructura de selecció.
 *
 * Avalueu el codi en Java següent. Per a quins valors de la variable x apareixerà
 * per pantalla el missatge "Ho has encertat"
 */
package E2p2EstructurasDeSeleccio;

/**
 *
 * @author ruben
 */
public class E2HoHasEncertat {

    public static void main(String[] args) {
        int m = 23;
        int n = 12;
        int x = 11;
        
        if ((x < n) || (x > m)) {
            System.out.println("Estàs fora del marge de valors correcte. ");
        } else {
            System.out.println("Ho has encertat!");
        }
    }
}
