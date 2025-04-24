/* EXO4 : A l'aide de Scanner et Print, tester si une valeur(type entier) est divisible par 2   
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 14
 * 
 * 
 * a est bien divisible par 2
 * 
 * 
*/

import java.util.Scanner;

class Exo4 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("\nEntrer un nombre :");                    // objet scanner demandant une entrée de 1 nombre

        int a = num.nextInt();                                         // déclaration de la variable a du scanner
        int div2 = a % 2;                                              // on récupère le reste de la division de a par 2 avec l'opérateur modulo

        System.out.println("\na = " + a);

        if (div2 == 0) {
            System.out.println("\n" + a + " est bien divisible par 2");  // Si le reste est égal à 0, a est divisible par 2
        } else {
            System.out.println("\n" + a + " n'est pas divisible par 2"); // sinon a n'est pas divisible par 2
        }
        num.close();
    }
}