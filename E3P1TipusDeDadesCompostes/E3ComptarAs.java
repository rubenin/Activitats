/** L'objectiu d'aquesta activitat és aprendre a recórrer un array per tractar els
 * valors que conté
 *
 * Genereu un programa en Java anomenat ComptaAsArray que compti quantes lletres a
 * conté un determinat array de caràcters. L'array per tractar pot ser qualsevol
 * i el podeu declarar com una constatn dins del codi font
 */
package E3P1TipusDeDadesCompostes;

/**
 *
 * @author ruben
 */
public class E3ComptarAs {

//Hi ha 4 as.
    public static final char[] array = {'a', 'c', 'z', 'a', 'w', 'a', 'q', 'f', 'c', 'a'};

    public static void main(String[] args) {
        int comptador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                comptador++;
            }
        }
        System.out.println("Hi ha " + comptador + "a's. ");
    }
}
