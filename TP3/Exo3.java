import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Saisie de la taille N du tableau (entre 10 et 50)
        int taille;
        do {
            System.out.print("Donnez la taille du tableau (entre 10 et 50) : ");
            taille = s.nextInt();
        } while (taille < 10 || taille > 50);

        int[] tableau = new int[taille];

        remplirTableau(tableau, s);
        System.out.println("Éléments du tableau :");
        afficherTableau(tableau);
    }

    private static void remplirTableau(int[] tableau, Scanner s) {
        System.out.println("Donnez les éléments du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément " + i + ": ");
            tableau[i] = s.nextInt();
        }
    }

    private static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + i + ": " + tableau[i]);
        }
    }
}
