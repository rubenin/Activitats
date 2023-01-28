/** L?objectiu d'aquesta activitat és fer partint de zero un programa que fa un càlcul
 * basat en expressions de diversos operands.
 *
 * Creeu un programa anomenat CalculRectangle que, partint del valor dels dos
 * costats d'un rectangle, en calculi el perimetre i l'àrea.
 *
 * Heu de definir els costats del rectangle am la variable següent:
 *
 *  -int constatGran = 7;
 *  -int costatPetit = 2;
 *
 * Heu de tenir en compte que:
 *
 *  -El perímetre d'un rectangle és el seu costat gran multiplicat per dos més el
 * seu costat petit multiplicat per dos.
 *  -L'àrea d'un rectangle es calcula multiplicant el valor del costat gran pel
 * del costat petit.
 */
package E1p2ManipulacioBasicaDeDades;

/**
 *
 * @author ruben
 */
public class E5CalculsRectangle {

    public static void main(String[] args) {
        int costatGran = 7;
        int costatPetit = 2;
        int perimetre = costatGran * 2 + costatPetit * 2;
        int area = costatGran * costatPetit;
        System.out.println("Perímetre: " + perimetre);
        System.out.println("Area: " + area);
    }
}
