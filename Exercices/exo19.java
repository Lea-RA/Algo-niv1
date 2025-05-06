/* EXO19 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me créer un convertisseur de secondes au format heures : minutes : secontes
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de secondes ?
 * 
 * 156000
 * 
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 * 
 * 
 * 
*/

import java.util.Scanner;

class exo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCombien de secondes ?");
        long Tsecondes = sc.nextLong();

        long heures = Tsecondes / 3600;   // il y a 3600 secondes dans une heure
        long minutes = Tsecondes % 3600 / 60;  // on prend le reste de notre division des heures et on divise par 60 (il y a 60 secondes dans une minute)
        long secondes = Tsecondes % 60;     // on prend le reste de la division des secondes par 60

        System.out.println("\n"+Tsecondes+" secondes correspond à "+heures+" heure(s), "+minutes+" minute(s) et "+secondes+" seconde(s)");
        sc.close();
    }
}


