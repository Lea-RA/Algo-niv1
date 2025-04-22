/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/

import java.util.Scanner;

class Exo3 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Entrer deux nombres :");                    // objet scanner demandant une entrée de 2 nombres

        int a = num.nextInt();                                          // première variable nombre entier a
        int b = num.nextInt();                                          // première variable nombre entier b                                        
        int resultat = a + b;                                           // entier résultat de la somme de a et b
        int div2 = resultat % 2;                                        // on récupère le reste de la division du resultat par 2 avec l'opérateur modulo

        System.out.println("\na = " + a + "\nb = " + b);                // sortie de a et b et de résultat
        System.out.println("");
        System.out.println("resultat = " + a + " + " + b);
        System.out.println("");
        System.out.println("resultat vaut " + resultat);

        if (div2 == 0) {
            System.out.println("\nresultat est pair");                 // si le reste est égal à 0 quand divisé par 2, resultat est pair
        } else {                                                         // sinon, il est impair
            System.out.println("\nresultat est impair");
        }
    }

}