/** L'objectiu d'aquesta activitat és aprendre a recórrer un array per tractar els
 * valors que conté.
 *
 * Feu un programa en Java anomenat MostraArray que mostri per pantalla el contingut
 * d'un array, definit com a variable dins del programa de la següent manera:
 *
 *  -int array[] = {1, 12, 4, 5, 7, 9, 0, 9, 6, 7};
 */
package E3P1TipusDeDadesCompostes;

/**
 *
 * @author ruben
 */
public class E1MostraUnArray {

    public static void main(String[] args) {

        int array[] = {1, 12, 4, 5, 7, 9, 0, 9, 6, 7};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
