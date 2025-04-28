/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 * 
 * 
 * 
*/

import java.util.Scanner;

class exo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        // appel du scanner

        System.out.println("\nVotre prix ?");
        float prix = sc.nextFloat();                                // declaration variable float prix comptant les centimes

        System.out.println("\nVotre réduction (en pourcentage %) ?");
        int pour100 = sc.nextInt();                                 // declaration pourcentage en entier (personne fait 20,5% sur les prix)

        if (pour100 < 100) {                                        // si le pourcentage est inférieur à 100
            float reduc1 = prix - (prix * pour100 / 100f);           // calcul reduc en produit en croix puis soustraction 
            float reduc = Math.round(reduc1 * 100f) / 100f;          // methode Math.round() permettant d'arrondir le prix au 2eme chiffre après la virgule (chaque centime compte !)
            System.out.println("\nPrix après réduction de " + pour100 + "% : " + String.format("%.4f", reduc) + " euros"); //String.format() pour afficher le prix avec 2 chiffres derrière la virgule et pas plus
        } else if (pour100 >= 100) {                                    // si pourcentage est supérieur à 100, le prix passe en dessous de 0€ et devient donc théoriquement gratuit
            System.out.println("\nOn ne donne rien gratuitement !");
        }
        sc.close();
    }
}


