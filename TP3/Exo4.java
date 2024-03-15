import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int taille;
        do {
            System.out.print("Donner la taille du tableau (entre 10 et 50) : ");
            taille = sc.nextInt();
        } while (taille < 10 || taille > 50);

        int[] tableau = new int[taille];
        remplirTableau(tableau, sc);
        // Affichage du tableau initial
        
        System.out.println("Tableau initial :");
        afficherTableau(tableau);

        effacerOccurrencesEtTasser(tableau);

        // Affichage du tableau résultant
        System.out.println("Tableau résultant après effacement des occurrences de 5 :");
        afficherTableau(tableau);
    }

    private static void remplirTableau(int[] tableau, Scanner sc) {
        System.out.println("Veuillez entrer les éléments du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément " + i + ": ");
            tableau[i] = sc.nextInt();
        }
    }

    private static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + i + ": " + tableau[i]);
        }
    }

    private static void effacerOccurrencesEtTasser(int[] tableau) {
        int tailleActu = tableau.length;
        int NouvTaille = 0;

        for (int i = 0; i < tailleActu; i++) {
            if (tableau[i] != 5) {
                tableau[NouvTaille] = tableau[i];
                NouvTaille++;
            }
        }

        int[] NouvTableau = new int[NouvTaille];
        System.arraycopy(tableau, 0, NouvTableau, 0, NouvTaille);
        
        System.arraycopy(NouvTableau, 0, tableau, 0, NouvTaille);
    }
}
