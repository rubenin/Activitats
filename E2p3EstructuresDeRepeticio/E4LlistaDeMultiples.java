/** L'objectiu d'aquesta activitat és aprendre a usar estructures de repetició per
 * generar valors a partir d'un recorregut.
 * 
 * Feu un programa anomenat LlistaMultiples que llegeixi des del teclat dos nombres
 * enters positius n1 i n2, amb n1 < n2, i escrigui, començant des de n1, tots els
 * nombres enters que són múltiples de n1 més petits o iguals que n2 , en ordre
 * creixent
 */
package E2p3EstructuresDeRepeticio;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class E4LlistaDeMultiples {
    
    public static void main(String[] args){

//Inicializamos la entrada de teclado
    Scanner lector = new Scanner(System.in);
    
//Solicitamos el valor de n1
    System.out.print("Quin és el valor de n1?");
    int n1 = lector.nextInt();
    lector.nextLine();
    
//Solicitamos el valor de n2 (menor que n1)
    System.out.print("Quin és el valor de n2 (més gran que n1)? ");
    int n2 = lector.nextInt();
    lector.nextLine();
    
    
    }
}
