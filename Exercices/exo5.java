/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/

import java.util.Scanner;

class Exo5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("\nEntrer trois nombres :");               // objet scanner demandant une entrée de 3 nombres

        int a = num.nextInt();                                              // déclaration première variable nombre entier a
        int b = num.nextInt();                                              // déclaration deuxième variable nombre entier b
        int c = num.nextInt();                                              // déclaration troisème variable nombre entier c
        int equation = a * b / c;                                           // déclaration du résultat de l'équation a x b / c

        System.out.println("\nequation = " + a + " x " + b + " / " + c);    // affiche l'équation
        System.out.println("\nequation = " + equation);                     // et son résultat

        if (equation > 10) {
            System.out.println("\n" + equation + " est supérieur à 10");    // s'affiche si result equation est supérieur à 10
        } else if (equation < 10) {
            System.out.println("\n" + equation + " est inférieur à 10");       // sinon affiche inférieur à 10
        }
        num.close();
    }
}