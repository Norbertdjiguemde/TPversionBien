import java.util.Arrays;
import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // 1. la taille du tableau
        System.out.print("Donnez la taille du tableau = ");
        int taille = scr.nextInt();
        int[] tableau = new int[taille];

        // remplir le tableau
        System.out.println("Entrez les valeurs du tableau =");
        for (int i = 0; i < taille; i++) {
            System.out.print("T[" + i + "] : ");
            tableau[i] = scr.nextInt();
        }

        //  Calculer la somme des éléments saisis
        int s = 0;
        for (int val : tableau) {
            s+= val;
        }

        // Calculer la moyenne des éléments
        double moy = (double) s / taille;

        // Copier le tableau dans un deuxième tableau T2 et l'afficher
        int[] T2 = Arrays.copyOf(tableau, taille);
        System.out.println("Tableau T2 = " + Arrays.toString(T2));

        // Classer les éléments du tableau dans un ordre croissant
        Arrays.sort(tableau);

        // Afficher le tableau trié
        System.out.println("Tableau trié dans l'ordre croissant : " + Arrays.toString(tableau));

        scr.close();
    }
}