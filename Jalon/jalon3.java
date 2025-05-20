
import java.util.Scanner;

public class jalon3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /***** CAS PRATIQUE NUM 3 *****/

        System.out.println("\nLe véhicule roulait à quelle vitesse ?");
        int vit = sc.nextInt();
        sc.nextLine();                          // on fait un nextLine pour éviter que le scanner compte l'espace après un int suivi d'un string

        System.out.println("Etiez-vous derrière pendant la collision ? (TRUE/FALSE)");
        boolean coll = Boolean.parseBoolean(sc.nextLine());                      // parseBoolean converti automatiquement une chaine de caractère true en booléen TRUE, le reste est FALSE

        System.out.println("Vous avez combien de kilomètres au compteur :");
        int kms = sc.nextInt();

        System.out.println("A combien d'années date votre dernier contrôle technique ? (0 si moins de 1 an)");
        int tech = sc.nextInt();


        if (vit<130 && coll!=true && (kms>150_000 && tech<=2 || kms<150_000 && tech<=5)) {       // si la vitesse était <130, la collision NOT true ET soit l'un des deux contôles valides, remplacement
            System.out.println("Félicitations, on va remplacer votre voiture !\n");
        } else {
            System.out.println("Vous ne remplissez pas les conditions, nous ne pourrons remplacer votre voiture.\n");
        }

        sc.close();
    }
}
