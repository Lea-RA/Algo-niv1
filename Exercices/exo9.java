/* EXO9 : La suite de l'EXO 8, une fois l'inscription terminé, essayez de vous connecter en donnant l'email et le mot de passe correspondant.
 * 
 * Si l'email ou le mot de passe n'est pas vous afficher "connexion refusée"
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
 * Pour vous connecter, renseignez votre email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * Renseignez votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * 
 * 
*/

import java.util.Scanner;

class Exo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    // Demande le scanner
        
        System.out.println("\nVotre prénom ?");
        String sname = sc.nextLine();

        System.out.println("\nVotre nom ?");                   
        String name = sc.nextLine().toUpperCase();              // Converti le nom en majuscule

        System.out.println("\nVotre adresse mail ?");
        String mail = sc.nextLine();

        System.out.println("\nVotre mot de passe ?");
        String mdp = sc.nextLine();

        System.out.println("\nConfirmer votre mot de passe ?");
        String cmdp = sc.nextLine();

        if (mdp.equals(cmdp)) {
            System.out.println("\nMerci " + sname + " " + name + ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + mail); 
                                                                                            // Avec la méthode equals() on vérifie la concordance des mots de passe
            System.out.println("\nPour vous connecter, renseigner votre email :");       // s'affiche uniquement si inscription est valide
            String rmail = sc.nextLine();

            if (mail.equals(rmail)) {                                           // verification concordance mail pour l'inscription mail = rmail
                System.out.println("\nRenseigner votre mot de passe :");       // si valide, demande le mot de passe
                String rmdp = sc.nextLine();

                if (mdp.equals(rmdp)) {                                         // verification mot de passe mdp = rmdp
                    System.out.println("\nConnexion validée.");                // dans ce cas connexion possible
                } else {
                    System.out.println("\nConnexion refusée, mot de passe invalide.");  // bonne adresse, mais mauvais mot de passe
                } 
            } else {
                System.out.println("\nConnexion refusée, adresse invalide.");           // mauvaise adresse
            }
        } else {
            System.out.println("\nInscription annulée.");                    // confirmation invalide, on annule l'inscription
        }  
        sc.close();                                                        
    }
}
