/** L'objectiu d'aquesta activitat és aprendre a usar estructures de repetició per
 * recórrer intervals de valors de manera que es pugui fer un càlcul amb cadas-cun.
 *
 * Feu un programa anomenat SumaInterval que llegeixi des del teclat dos nombres
 * enters n1 i n2, amb n1 < n2, i escrigui la suma dels nombres enters que hi ha
 * dins l'interval [n1, n2]
 */
package E2p3EstructuresDeRepeticio;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class E3SumaDUnInterval {
    
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
//Consultamos el primer valor
        System.out.print("Quin és el valor de n1? ");
        int n1 = lector.nextInt();
        lector.nextLine();
        
//Consultamos el segundo valor
        System.out.print("Quin és el valor de n2 (més gran que n1)? ");
        int n2 = lector.nextInt();
        lector.nextLine();
        
//Inicializamos una variable llamada acumulador donde mostrar la suma de todos los
//valores
        int acumulador = 0;
        
//Creamos el condicional
        if (n1 < n2){
            for (int i = n1; i <= n2; i++){//bucle que lleva a cabo la operación
                acumulador = acumulador + i;
            }
            System.out.println("La suma total és "+acumulador+".");
        }else{
            System.out.println("n2 no és més gran que n1!");
        }
    }
}
