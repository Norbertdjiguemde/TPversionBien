import java.util.Scanner;

public class TP125 {
    public static void main(String[] args) {
        int[] ButsParJoueur = new int[22];

        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < 22; i++) {
            System.out.print("Nombre de buts par joueur " + (i + 1) + ": ");
            ButsParJoueur[i] = scr.nextInt();
        }

        // Affichage du numéro du buteur de l'équipe, du total de buts et du nombre de joueurs sans buts
        System.out.println("\n Statistiques de l'équipe :");
        int totalButs = 0;
        int NumButeur = -1;
        int joueursSansButs = 0;

        for (int i = 0; i < 22; i++) {
            System.out.println("Joueur " + (i + 1) + ": " + ButsParJoueur[i] + " buts");

            // Vérifier si le joueur a marqué un but
            if (ButsParJoueur[i] > 0) {
                NumButeur = i + 1; // Enregistre le numéro du premier buteur trouvé
            } else {
                joueursSansButs++;
            }

            // Calcul du total de buts pour l'équipe
            totalButs += ButsParJoueur[i];
        }

        // Affichage du numéro du buteur de l'équipe
        if (NumButeur != -1) {
            System.out.println("\nButeur de l'équipe : Joueur " + NumButeur);
        } else {
            System.out.println("\nAucun but marqué par l'équipe.");
        }

        // Affichage du total de buts pour l'équipe
        System.out.println("Total de buts pour l'équipe : " + totalButs);

        // Affichage du nombre de joueurs n'ayant pas marqué de buts
        System.out.println("Nombre de joueurs sans buts : " + joueursSansButs);

        // Fermeture du scanner
        scr.close();
    }
}