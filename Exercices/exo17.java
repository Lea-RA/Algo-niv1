/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/

import java.util.Scanner;

class exo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nQuel est le type de votre carburant ?");
        int type = sc.nextInt();
        String stype = "";

        switch (type) {                                     // switch parcourant les types de carburant
            case 0:
                stype = "Gazole";
                break;
            case 1:
                stype = "Sans Plomb 95";
                break;
            case 2:
                stype = "Sans Plomb 98";
                break;
            default:
                System.out.println("\nCarburant non disponible.");
                break;
        }

        if (type == 0 || type == 1 || type == 2) {
            System.out.println("\nVous avez choisi : "+stype);

            System.out.println("\nQuelle est la distance à parcourir (en km) ?");
            int km = sc.nextInt();

            /****** Calcul Variables *********************/

            float prixG = Math.round((6.5 / 100) * km * 1.577f * 100f) / 100f;
            float prix95 = Math.round((5.5 / 100) * km * 1.70f * 100f) / 100f;
            float prix98 = Math.round((5.5 / 100) * km * 1.782f * 100f) / 100f;
            float prix = 0;
            
            /**********************************************/

            switch (type) {                 // switch parcourant le type du carburant pour attribuer le bon prix
                case 0:
                    prix += prixG;
                    break;
                case 1:
                    prix += prix95;
                    break;
                case 2:
                    prix += prix98;
                    break;
            }

            System.out.printf("\nPour "+km+" km, vous allez dépenser "+String.format("%.2f", prix)+" euros");
        }
        sc.close();
    }
}

