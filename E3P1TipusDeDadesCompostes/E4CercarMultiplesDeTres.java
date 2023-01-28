/** L'objectiu d'aquesta activitat és aprendre a recórrer un array per tractar els
 * valors que conté.
 *
 * Feu un programa en Java anomenat CercaTres que mostri per pantalla el segon
 * múltiple de 3 que trobi en un array. Cal definir l'array dins del método
 * principal.
 *
 * Proveu el resultat usant les definicions següents d'array, una per a cada
 * execució diferent:
 *
 *  -//Primer proveu si funciona usant aquest array.
 *      int array[] = {1, 12, 4, 5, 7, 3, 2, 9, 6, 7};
 *
 *  -//Després proveu si funciona usant aquest array.
 *      int array[] = {1, 13, 4, 5, 7, 3, 2, 8, 5, 7};
 */
package E3P1TipusDeDadesCompostes;

/**
 *
 * @author ruben
 */
public class E4CercarMultiplesDeTres {

    public static void main(String[] args) {

        int array[] = {1, 13, 4, 5, 7, 3, 2, 8, 5, 7};
        int i = 0;
        int numMultiples = 0;

        while ((numMultiples < 2) && (i < array.length)) {
            if (array[i] % 3 == 0) {
                numMultiples++;
                if (numMultiples == 2) {
                    System.out.println("El segon múltiple és: " + array[i] + ".");
                }
            }
            i++;
        }
        if (numMultiples < 2) {
            System.out.println("Hi ha menys de 2 múltiples de tres...");
        }
    }
}
