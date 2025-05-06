/* EXO18 : Avec PRINT & SCANNER : 
 * 
 * 
 * Vous souvenez vous de l'exercice d'algèbre de Boole de la banque ? Une banque vous accorde un prêt immobilier 
 * si vous répondez aux critères suivants :
 * 
 * condition 1 : Avoir un CDI avec un salaire de plus 3000€
 * 
 * condition 2 : Avoir un apport de 25% de la somme demandé
 * 
 * condition 3 (Si la condition 1 n'est pas rempli ) : Avoir une autre propriété 
 * valant minimum 75% du prêt demandé
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
    * Quel est le montant de votre prêt ?
 * 
 * 150000
 * 
 * Êtes-vous en CDI ?
 * 
 * TRUE
 * 
 * Combien avez-vous d'abord ?
 * 
 * 1500
 * 
 * Vous ne pouvez pas hélas obtenir de prêt !

 * 
*/

import java.util.Scanner;

class exo18 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("\nQuel est le montant de votre prêt ?");
      int pret = sc.nextInt();
      sc.nextLine();

   /* System.out.println("\nÊtes-vous en CDI ?");                // premier code brouillon mais fonctionnel avec des lignes supperflues
      String sCDI = sc.nextLine().toLowerCase();
      boolean CDI = false;

      System.out.println("\nCombien avez-vous d'apport ?");
      int apport = sc.nextInt();
      sc.nextLine();

      if (apport < 20 * pret / 100) {
         System.out.println("\nVous ne pouvez pas obtenir de prêt.");

      } else if (sCDI.equals("true") || sCDI.equals("oui")) {
         CDI = true;
         System.out.println("\nPrêt accordé.");
         
      } else if (CDI == false) {
         System.out.println("\nAvez-vous une autre propriété ?");
         String sProp = sc.nextLine().toLowerCase();
     
         if (!(sProp.equals("true") || sProp.equals("oui"))) {
            System.out.println("\nVous ne pouvez pas obtenir de prêt.");

         } else {
            System.out.println("\nA combien est-elle valuée ?");
            int valeur = sc.nextInt();

            if (valeur >= 75 * pret / 100) {
               System.out.println("\nPrêt accordé.");
               
            } else {
               System.out.println("\nVous ne pouvez pas obtenir de prêt.");
            }
         }
      }        
   }         
} */

      System.out.println("\nÊtes-vous en CDI ? ");         // deuxième code revu
         boolean enCDI = isYes(sc.nextLine());              // utilisation de la méthode booléenne 

      System.out.println("\nCombien avez-vous d'apport ? ");
      int apport = sc.nextInt();
      sc.nextLine();
       
      if (apport < pret * 20 / 100) {                                   // si apport < 20%, aucun prêt accordé
         System.out.println("\nVous ne pouvez pas obtenir de prêt.");

      } else if (enCDI) {                                      // si apport + CDI = prêt
         System.out.println("\nPrêt accordé.");
       
      } else {
         System.out.println("\nAvez-vous une autre propriété ? ");      // sinon on vérifie si il y a une autre propriété
           
         if (!isYes(sc.nextLine())) {                                         // scanner NOT oui / true (méthode isYes) = pas de prêt
               System.out.println("\nVous ne pouvez pas obtenir de prêt.");
         } else {                                                             // sinon on demande sa valeur
            System.out.println("\nA combien est-elle valuée ? ");
            int valeur = sc.nextInt();
               
            if (valeur >= pret * 75 / 100) {                            // si la valeur est < ou = à 70% du prêt, c'est bon, sinon pas de prêt
               System.out.println("\nPrêt accordé.");
            
            } else {
               System.out.println("\nVous ne pouvez pas obtenir de prêt.");
            }
         }
      } 
      sc.close();
   }

   static boolean isYes(String input) {      // méthode isYes qui retourne true ou false dans le code selon la rentrée utilisateur
      return input.equalsIgnoreCase("oui") || input.equalsIgnoreCase("true");
   }
}
