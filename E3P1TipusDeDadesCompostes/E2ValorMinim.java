/** L'objectiu d'aquesta activitat és aprendre a recórrer un array per tractar els
 * valors que conté.
 *
 * Genereu un programa en Java anomenat ValorMinim que calculi quin és el valor
 * mínim d'un array de nombres reals i mostri per pantalla. L'array per tractar
 * pot ser qualsevol i el podeu declarar com una constant dins del codi font.
 */
package E3P1TipusDeDadesCompostes;

/**
 *
 * @author ruben
 */
public class E2ValorMinim {

    public static final double[] array = {1, -2.2, 6.7, 4, 23.5, -5.5, 4.43, 20};

    public static final void main(String[] args) {

        double minim = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minim) {
                minim = array[i];
            }
        }
        System.out.println("El valor mínim és " + minim + ". ");
    }
}
