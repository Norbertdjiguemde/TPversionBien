import java.util.Scanner;

public class Exo5{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Donner la taille du tableau : ");
        int taille = sr.nextInt();
        int[] tableau = new int[taille];

        remplirTableau(tableau, sr);
        
        // Affichage du tableau initial
        System.out.println("Tableau initial :");
        afficherTableau(tableau);

        // Inversion de l'ordre des éléments du tableau
        inverserOrdreTableau(tableau);

        // Affichage du tableau résultant
        System.out.println("Tableau résultant après inversion :");
        afficherTableau(tableau);
    }

    private static void remplirTableau(int[] tableau, Scanner scanner) {
        System.out.println("Veuillez entrer les éléments du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément " + i + ": ");
            tableau[i] = scanner.nextInt();
        }
    }

    private static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + i + ": " + tableau[i]);
        }
    }

    private static void inverserOrdreTableau(int[] tableau) {
        int debut = 0;
        int fin = tableau.length - 1;
 while (debut < fin) {
            int temp = tableau[debut];
            tableau[debut] = tableau[fin];
            tableau[fin] = temp;
            
            debut++;
            fin--;
        }
    }
}