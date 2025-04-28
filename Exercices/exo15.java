/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/

import java.util.Scanner;

class exo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    // appel du scanner

        System.out.println("\nQuel est votre monnaie ?");
        String monnaie = sc.nextLine().toUpperCase();
        
        System.out.println("\nQuel est votre montant ?");
        double montant = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nVous voulez la convertir en quelle devise ?");
        String devise = sc.nextLine().toUpperCase();

        /* Conversion avec taux de change fixe */

        double EURtoUSD = Math.round(montant * 1.1389d * 100d) / 100d;          // multiplier le montant par son taux de change et l'arrondir 2 chiffres après la virgule
        double USDtoEUR = Math.round(montant * 0.8781d * 100d) / 100d;
        double EURtoGBP = Math.round(montant * 0.8541d * 100d) / 100d;
        double GBPtoEUR = Math.round(montant * 1.1713d * 100d) / 100d;
        double USDtoGBP = Math.round(montant * 0.7498d * 100d) / 100d;
        double GBPtoUSD = Math.round(montant * 1.3339d * 100d) / 100d;
        double EURtoJPY = Math.round(montant * 162.4900d * 100d) / 100d;
        double JPYtoEUR = Math.round(montant * 0.0062d * 100d) / 100d;
        double USDtoJPY = Math.round(montant * 142.6800d * 100d) / 100d;
        double JPYtoUSD = Math.round(montant * 0.0070d * 100d) / 100d;
        double GBPtoJPY = Math.round(montant * 190.3200d * 100d) / 100d;
        double JPYtoGBP = Math.round(montant * 0.0053d * 100d) / 100d;

        /**************************************** */

        // si la monnaie et la devise correspond à ce qui a été tapé par l'utilisateur, affiche la conversion

        if (monnaie.equals("EUR") && devise.equals("USD")) {                        
            System.out.println("Résultat : " + String.format("%.2f", EURtoUSD) + " USD");
        } else if (monnaie.equals("USD") && devise.equals("EUR")) {
            System.out.println("Résultat : " + String.format("%.2f", USDtoEUR) + " EUR");
        } else if (monnaie.equals("EUR") && devise.equals("GBP")) {
            System.out.println("Résultat : " + String.format("%.2f", EURtoGBP) + " GBP");
        } else if (monnaie.equals("GBP") && devise.equals("EUR")) {
            System.out.println("Résultat : " + String.format("%.2f", GBPtoEUR) + " EUR");
        } else if (monnaie.equals("USD") && devise.equals("GBP")) {
            System.out.println("Résultat : " + String.format("%.2f", USDtoGBP) + " GBP");
        } else if (monnaie.equals("GBP") && devise.equals("USD")) {
            System.out.println("Résultat : " + String.format("%.2f", GBPtoUSD) + " USD");
        } else if (monnaie.equals("EUR") && devise.equals("JPY")) {
            System.out.println("Résultat : " + String.format("%.2f", EURtoJPY) + " JPY");
        } else if (monnaie.equals("JPY") && devise.equals("EUR")) {
            System.out.println("Résultat : " + String.format("%.2f", JPYtoEUR) + " EUR");
        } else if (monnaie.equals("USD") && devise.equals("JPY")) {
            System.out.println("Résultat : " + String.format("%.2f", USDtoJPY) + " JPY");
        } else if (monnaie.equals("JPY") && devise.equals("USD")) {
            System.out.println("Résultat : " + String.format("%.2f", JPYtoUSD) + " USD");
        } else if (monnaie.equals("GBP") && devise.equals("JPY")) {
            System.out.println("Résultat : " + String.format("%.2f", GBPtoJPY) + " JPY");
        } else if (monnaie.equals("JPY") && devise.equals("GBP")) {
            System.out.println("Résultat : " + String.format("%.2f", JPYtoGBP) + " GBP");
        } else {
            System.out.println("Conversion annulée.");      // si devise = monnaie ou n'importe autre information est rentrée, la conversion échoue.
        }
        sc.close();
    }
}
