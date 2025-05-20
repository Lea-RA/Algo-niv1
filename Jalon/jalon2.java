
import java.util.Scanner;

public class jalon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /***** CAS PRATIQUE NUM 2 *****/

        int brut;

        System.out.println("\nQuel est votre salaire BRUT (en euros) :");
        brut = sc.nextInt();

        float net = Math.round(brut * 0.77f * 100) / 100f;                  /* salaire brut - 23% de charge
                                                                            math round pour avoir deux chiffre après la virgule */
        System.out.println("Votre salaire NET sera de "+net+" euros.\n");

        sc.close();
    }
}