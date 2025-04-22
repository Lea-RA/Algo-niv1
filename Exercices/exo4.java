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

        int a = num.nextInt();                                         // 
        int div2 = a % 2;

        System.out.println("\na = " + a);

        if (div2 == 0) {
            System.out.println("\n" + a + " est bien divisible par 2");
        } else {
            System.out.println("\n" + a + " n'est pas divisible par 2");
        }

    }
}