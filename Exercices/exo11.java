/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/

import java.util.Scanner;

class exo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    // Appel du scanner
        
        int solde = 3000;                                       // declaration de la variable solde de notre compte banquaire

        System.out.println("\nBonjour, combien voulez-vous retirer ?");
        int retire = sc.nextInt();

        if (retire <= solde) {                                                              // si l'argent retiré est inférieur ou égal au solde
            solde -= retire;                                                                // enlève à solde le montant retiré
            System.out.println("\nOpérartion validée. Il vous reste " + solde +" euros.");    // indication du solde restant
        } else if (retire > solde) {                                                        // mais si l'argent retiré est supérieur au solde disponible
            System.out.println("\nOpération refusée, fond insufisant !");                   // l'opération est refusée
        }
        sc.close();
    }
}


