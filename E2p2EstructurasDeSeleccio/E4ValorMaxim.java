/** L'objectiu d'aquesta activitat és generar un programa que discrimina valors
 * usant una estructura de selecció.
 *
 * Creeu un programa anometat ValorMaxim que decideixi quin és el més gran de dos
 * nombres reals. Cal que imprimeixi per pantalla el més gran. Si són iguals, es
 * pot imprimir qualsevol dels dos. Els valor per comparar els heu de declarar com
 * a constatns, amb el nom que vulgueu.
 */
package E2p2EstructurasDeSeleccio;

/**
 *
 * @author ruben
 */
public class E4ValorMaxim {

    public static final double PRIMER_VALOR = 15.5;

    public static final double SEGON_VALOR = 9.35;

    public static void main(String[] args) {
        if (PRIMER_VALOR >= SEGON_VALOR) {
            System.out.println("El máxim es " + PRIMER_VALOR);
        } else if (PRIMER_VALOR < SEGON_VALOR) {
            System.out.println("El máxim es " + SEGON_VALOR);
        }
    }
}
