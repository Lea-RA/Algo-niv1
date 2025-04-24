/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : 
 * 
 * 
*/

import java.util.Scanner;

class Exo10 {

    static int score = 0;      // declaration de la variable score utilisable partout dans le code

    static void checkAnswr(boolean answr, String rep) {             // méthode checkanswr permet de aérer le code
        if (rep.equals("vrai") || rep.equals("v") && answr == true) {          // si l'utilisateur dit vrai est que la réponse est vrai, score + 1
            score++;
        } else if (rep.equals("faux") || rep.equals("f") && answr == false) {  // si l'utilisateur dit faux est que la réponse est fausse, score + 1
            score++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Est-ce que les boïtes noires d'avion sont-elles noires ? (Vrai ou Faux)");
        String rep1 = sc.nextLine().toLowerCase();      // utilisateur rentre vrai/v ou faux/f
        checkAnswr(false, rep1);                    // checkanswr prend le booléen de la question et la compare à la réponse utilisateur et incrémente le score si juste

        System.out.println("La lumière est-elle plus rapide que le son ? (Vrai ou Faux)");
        String rep2 = sc.nextLine().toLowerCase();
        checkAnswr(true, rep2);

        System.out.println("Le crâne est-il l'os le plus solide du corps humain ? (Vrai ou Faux)");
        String rep3 = sc.nextLine().toLowerCase();
        checkAnswr(false, rep3);

        System.out.println("C'est possible d'éternuer avec les yeux ouverts ? (Vrai ou Faux)");
        String rep4 = sc.nextLine().toLowerCase();
        checkAnswr(true, rep4);

        System.out.println("Le koala possède-t-il des empreintes digitales ? (Vrai ou Faux)");
        String rep5 = sc.nextLine().toLowerCase();
        checkAnswr(true, rep5);

        System.out.println("Résultat : " + score + "\\5");   // affiche le score final
        sc.close();
    }
}