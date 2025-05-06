/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
 * 
*/

import java.util.Scanner;

class exo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL_VOTES = 150000;     // en final, le total des votes ne changeras jamais quoi qu'il arrive
        boolean gagnant = false;            // booléen qui servira à faire notre boucle

        while (!gagnant) {                  // tant que PAS de gagnant, boucle :
            int voteJO = 0;                 // votes Inutile
            int voteVI = 0;                 // votes Escreau
            int sumVote = 0;                // total des votes

            while (true) {
                System.out.println("\nCombien de gens ont voté pour Joseline Inutile ?");
                voteJO = sc.nextInt();

                System.out.println("\nCombien de gens ont voté pour Vincent Escreau ?");
                voteVI = sc.nextInt();

                sumVote = voteJO + voteVI;

                if (sumVote > TOTAL_VOTES) {
                    System.out.println("\nErreur : le total des votes dépasse 150 000. Veuillez recommencer.");           
                } else {
                    break;      // on sort de la boucle quand les votes ne dépassent pas le nombre de votants
                }
            }
            
            int abstentions = TOTAL_VOTES - sumVote;
            System.out.println("\nVous avez "+abstentions+" d'abstentions, ils seront comptés nuls");

            double pcentJO = (voteJO * 100d / sumVote);     // pourcentage josline
            double pcentVI = (voteVI * 100d / sumVote);     // pourcentage vincent

            System.out.printf("Joseline Inutile : %.1f%%\n", pcentJO);
            System.out.printf("Vincent Escreau : %.1f%%\n", pcentVI);

            if (pcentJO > 60) {
                System.out.println("\nJoseline Inutile est la nouvelle maire de Mulhouse.");
                gagnant = true;
            } else if (pcentVI > 60) {                                                          // si un des candidats à > 60%, on sort de la boucle
                System.out.println("\nVincent Escreau est le nouveau maire de Mulhouse.");
                gagnant = true; 
            } else {
                System.out.println("\nAucun candidat n'a atteint 60%, un nouveau tour est nécessaire.");        // sinon on refait un tour
                System.out.println("\n=== Nouveau tour ===");
            }
        }   
    }
}