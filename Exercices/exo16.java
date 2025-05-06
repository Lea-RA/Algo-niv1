/* EXO16 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me faire un algo qui change le prix d'un vol selon les paramètres suivants :
 * 
 * Réduction de 20% si le passager est mineur
 * 
 * Réduction de 40% si le passager est senior de plus 60 ans
 * 
 * Réduction de 20% si il y a plus de 60 places disponibles
 * 
 * Augmentation de 20% si il y a moins de 20 places disponibles
 * 
 * Augmentation de 20% si le passager a choisit la classe business 
 * 
 * -----Vous définisserez vous même le prix initial du vol, le nombre de place disponible, l'âge du voyageur
 * 
 * Si le voyageur a choisi une classe business
 * 
 * 
 *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est l'âge de votre passager ?
 * 
 * 15
 * 
 * Le passager veut-il une classe business (oui/non) ?
 * 
 * oui
 * 
 * Le prix du vol :
 * 
 * 1200
 * 
 * Nombre de places disponibles :
 * 
 * 50
 * 
 * Le prix du vol est de 1200 euros
 * 
 * 
*/

import java.util.Scanner;

class Exo16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nQuel est l'âge de votre passager ?");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("\nLe passager veut-il une classe business ? (oui/non)");
        String classe = sc.nextLine().toLowerCase();

        System.out.println("\nLe prix du vol :");
        int billet = sc.nextInt();
        sc.nextLine();

        System.out.println("\nNombre de places disponibles :");
        int places = sc.nextInt();

        /********* Variables ***************/

        int vpcent = billet * 20 / 100;         // 20%
        int qpcent = billet * 40 / 100;         // 40%

        /************ Conditions *************/

        if (age < 18) {
            billet -= vpcent;
        } else if (age >= 60) {
            billet -= qpcent;
        }

        if (places >= 60) {
            billet -= vpcent;
        } else if (places > 0 && places < 20) {
            billet += vpcent;
        }

        if (classe.equals("oui")) {
            billet += vpcent;
        }
       
        System.out.println("\nLe prix du vol est de "+billet+" euros");
        sc.close();
    }
}


