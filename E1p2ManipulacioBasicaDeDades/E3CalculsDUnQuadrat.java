/** l?objectiu d'aquesta activitat és fer partint de zero un programa que faci un
 * càlcul senzill usant variables.
 *
 * Creeu un programa anometat CalculQuadrat que, partint del valor d'un dels costats
 * d'un quadrat, en calculi el perímetre i l'area.
 *
 * Heu de definir el costat del quadrat amb la variable següent:
 *  "int costat";
 *  "costat = 7;
 *
 * Heu de tenir en compte que:
 *  -El perímetre d'un quadtar és el seu costat multiplicat per quatre (costat per 4)
 *  -L'area d'un quadrat es calcula multiplicant el valor del costat per ell mateix
 * (costat per costat)
 */
package E1p2ManipulacioBasicaDeDades;

/**
 *
 * @author ruben
 */
public class E3CalculsDUnQuadrat {

    public static void main(String[] args) {
        int costat = 7;
        int perimetre = costat * 4;
        int area = costat * costat;
        System.out.println("Perimetre: " + perimetre);
        System.out.println("Area: " + area);
    }
}
