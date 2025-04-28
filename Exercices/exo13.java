/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
 * 
 * 
*/

import java.util.Scanner;

class exo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    // appel du scanner

        System.out.println("\nDonner une taille en centimètre ?");
        int taille = sc.nextInt();                              // declaration d'un entier taille
        double tailleM = taille / 100d;                         // declaration d'un double taille M en divisant taille par 100

        System.out.println(taille + " cm vaut " + String.format("%.2f", tailleM) + " m"); // String.format() pur garder 2 chiffres après la virgule
        sc.close();
    }
}


