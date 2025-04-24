/* EXO2 : A l'aide de Scanner et Print, me faire afficher le résultat d'une soustraction (types entiers) et vérifier si elle est inférieur à 0    
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a - b
 * 
 * resultat = -1
 * 
 * resutat est inférieur à 0
 * 
 * 
 * 
 */

import java.util.Scanner;

 class Exo2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("\nEntrer deux nombres :");                    // Objet scanner demandant une entrée de 2 nombres

        int a = num.nextInt();                                          // déclaration première variable nombre entier a
        int b = num.nextInt();                                          // déclaration deuxième variable nombre entier b                                        
        int resultat = a - b;                                           // entier résultat de la différence de a et b

        System.out.println("\na = " + a + "\nb = " + b);                // sortie de a et b et de résultat
        System.out.println("\nresultat = " + a + " - " + b);
        System.out.println("\nresultat vaut " + resultat);

        if (resultat < 0) {
            System.out.print("\n" + resultat + " est inférieur à 0");   // s'affiche uniquement si le resultat est inférieur à 0
        }
        num.close();
    }
 }