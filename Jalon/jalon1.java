
import java.util.Scanner;

public class jalon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Initialisation du scanner pour recevoir des input utilisateur 

        /***** CAS PRATIQUE NUM 1 *****/

        int bouteille = 100;   // 100 cl = 1L
        int cl;                // les cl bu


        System.out.println("\nCombien de centilitres d'eau voulez-vous boire ?");
        cl = sc.nextInt();

        if (cl>=bouteille) {                                                                   
            System.out.println("La bouteille est vide, c'est rafraichissant !\n");
        } else {
            bouteille -= cl;
            System.out.println("Il reste encore "+bouteille+" cl d'eau dans la bouteille.\n");
        }

        sc.close();
    }
}
