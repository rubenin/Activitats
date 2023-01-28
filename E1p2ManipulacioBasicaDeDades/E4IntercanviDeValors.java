/** L'objectiu d'aquesta activitat és fer partint de zero un programa en què es
 * manipulen els valor emmagatzemats dins de variables i es reflexiona sobre
 * quan cal usar-ne de noves.
 *
 * Creeu un programa anometat IntercanviDeValors que, partint de les variables
 * següents mostri els seus valors, els intercanviï (es a dir, que nomB contingui
 * el valor de numA i numA contingui el valor de numB) i els torni a mostrar
 */
package E1p2ManipulacioBasicaDeDades;

/**
 *
 * @author ruben
 */
public class E4IntercanviDeValors {

    public static void main(String[] args) {
        int numA = 2;
        int numB = 67;

        System.out.println("Abans \n------");
        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);

        int numAux = numA;
        numA = numB;
        numB = numAux;

        System.out.println("\nDesprés\n------");
        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);
    }
}
