/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
 * 
 * 
 * 
*/

import java.util.Scanner;

class exo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    // appel du scanner

        System.out.println("Donner une valeur A OU B ET NON C");
        boolean A = Boolean.parseBoolean(sc.nextLine());            // Boolean.parseBoolean() converti notre chaine de caractere String directement en booléen
        boolean B = Boolean.parseBoolean(sc.nextLine());            // Si string = "true" "True" "TRUE" etc, booléen = true
        boolean C = Boolean.parseBoolean(sc.nextLine());            // Tout le reste sera booléen = false

        boolean resultat = A || B && !C;                        // A ou B et non C
        System.out.println("Résultat : " + resultat);
        sc.close();
    }
}

