/**L'objectiu d'aquesta activitat és entendre el funcionament d'una expressió 
 * relacional basada en variables.
 * 
 * Creeu un programa anometat VariableBooleana. Cal que contingui les instruccions
 * següents:
 * 
 *  -int a = 23;
 *  -int b = 12;
 *  -boolean resultat = a > b;
 *  -System.out.println(resultat);
 * 
 * Compileu-lo i executeu-lo. Quin valor mostra? Què indica aquest valor?
 * 
 * Tot seguit, modifiqueu-lo, canviant l'assignació a resultat:
 * 
 *  -resultat = a < b;
 * 
 * Compileu i executeu-lo. Quin valor mostra ara? Què indica aquest valor?
 * 
 * 
 */

package E1p2ManipulacioBasicaDeDades;

/**
 *
 * @author ruben
 */
public class E7AnalisiDOperadorsRelacionals {
    
    public static void main(String[] args){
        int a = 23;
        int b = 12;
        boolean resultat = a > b;
        
        System.out.println(resultat);
    }
}
