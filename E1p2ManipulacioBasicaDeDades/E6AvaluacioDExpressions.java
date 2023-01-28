/** L'objectiu d'aquesta activitat és fer partint de zero un programa que avalua
 * expressions compostes per diversos operands, alguns d'aquests variables.
 *
 * Creeu un programa anomenat AvaluadorExpressions que, partint de les variables
 * següents:
 *
 *  -int a = 3;
 *  -int b = 8;
 *  -int c = 4;
 *  -int d = 2;
 *
 * Executi i mostri el resultat d'avaluar les expressions següents:
 *
 *  - 2 - a * b + c
 *  - (2 - a) * b + c
 *  - a * b - c * a - d
 *  - a / 23 - b
 *  - a / (33 - b)
 *  - d * 23 - 1 + b
 */
package E1p2ManipulacioBasicaDeDades;

/**
 *
 * @author ruben
 */
public class E6AvaluacioDExpressions {

    public static void main(String[] args) {

        int a = 3;
        int b = 8;
        int c = 4;
        int d = 2;

        System.out.println(2 - a * b + c);
        System.out.println((2 - a) * b + c);
        System.out.println(a * b - c * a - d);
        System.out.println(a / 3 - b);
        System.out.println(a / (33 - b));
        System.out.println(d * 23 - 1 + b);
    }
}
