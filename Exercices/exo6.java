/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/

import java.util.Scanner;

class Exo6 {
    public static void main(String[] args) {
        Scanner myInfo = new Scanner(System.in);
        System.out.println("\nDonner prénom et âge :");                       // Objet scanner demandant un nom (string) et un âge (int)

        String name = myInfo.nextLine();                                        // déclaration variable string prénom
        int age = myInfo.nextInt();                                             // déclaration variable int âge

        System.out.println("\nprénom = \"" + name + "\"");                          // affiche prénom
        System.out.println("\nâge = " + age);                                       // affiche âge
        System.out.println("\nJe m'appelle " + name + ", j'ai " + age + " ans");    // affiche une phrase avec nos variables prénom et âge
        myInfo.close();
    }

}