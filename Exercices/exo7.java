/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/

import java.util.Scanner;

class Exo7 {
    public static void main(String[] args) {
        Scanner eng = new Scanner(System.in);
        System.out.println("\nDo you speak english (Y/N)?");        // demande un scanner

        String answr = eng.nextLine().toLowerCase();                            // déclaration variable answer. Elle sera converti en minuscule
                                                                                // pour permettre plusieurs entrées
        if (answr.equals("y") || answr.equals("yes")) {
            System.out.println("\nNice to meet you!");                          // la méthode equals() permet de verifier l'equivalence de la chaine de caractère pour y OU yes
        } else if (answr.equals("n") || answr.equals("no") ) {  // (y, Y, yes, Yes, YES etc.) sont valides. Sinon (n, N, no, No, NO etc.) sont valides.
            System.out.println("\nSo learn english! >:(");                      
        } else {
            System.out.println("\nThis is not an acceptable answer.");          // Toute autre entrée sera non valide.
        }
    }
}