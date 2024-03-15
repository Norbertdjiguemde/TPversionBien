import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        int[] tableau = new int[10];
        
        remplirTableau(tableau);

        // Affichage des éléments du tableau
        System.out.println("Tableau :");
        afficherTableau(tableau);
    }

    private static void remplirTableau(int[] tableau) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Donnez les éléments du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément " + i + ": ");
            tableau[i] = scr.nextInt();
        }
    }

    private static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + i + ": " + tableau[i]);
        }
    }
}