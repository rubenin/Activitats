/** L'objectiu d'aquesta activitat és crear un programa que fa diferents operacions
 * aritmètiques sobre variables partit d'un codi font preexistent.
 *
 * Modifiqueu el programa següent perquè sobre la variablre resultat es facin les
 * transformacions següens, en aquest ordre:
 *
 *  -Se li resti 10.
 *  -Es multipliqui pel valor de la variable m.
 *  -Es mostri el seu valor actual per pantalla.
 *  -Es divideixi per n.
 *  -Se li sumi 20.
 *  -Es mostri el seu valor actual per pantalla.
 */
package E1p2ManipulacioBasicaDeDades;

/**
 *
 * @author ruben
 */
public class E2ModificaResultat {

    public static void main(String[] args) {
        double m = 23;
        double n = 12;
        double resultat = 0;
        resultat = m + n;
        System.out.println(resultat);

//Feu les modificacions a partir d'aqui.
        resultat = resultat - 10;
        System.out.println(resultat);
        resultat = resultat * m;
        System.out.println(resultat);
        resultat = resultat / n;
        System.out.println(resultat);
        resultat = resultat + 20;
        System.out.println(resultat);
    }
}
