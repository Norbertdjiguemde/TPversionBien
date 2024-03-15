import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Donnez la taille du tableau : ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("La taille du tableau doit être positive.");
            return;
        }
        int[] T = new int[N];
        System.out.println("Donnez les valeurs du tableau :");
        for (int i = 0; i < N; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }
        int[] TP = new int[N];
        int[] TN = new int[N];
        int cTP = 0; /* Compteur pour les valeurs positives*/
        int cTN = 0; /* Compteur pour les valeurs négatives*/

        // Copier les valeurs positives dans TP et les valeurs négatives dans TN
        for (int i = 0; i < N; i++) {
            if (T[i] > 0) {
                TP[cTP++] = T[i];
            } else if (T[i] < 0) {
                TN[cTN++] = T[i];
            }
        }

        // Afficher le tableau principal
        System.out.print("Tableau principal T : [");
        for (int i = 0; i < N; i++) {
            System.out.print(T[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Tableau TP (valeurs positives) : [");
        for (int i = 0; i < cTP; i++) {
            System.out.print(TP[i]);
            if (i < cTP - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Tableau TN (valeurs négatives) : [");
        for (int i = 0; i < cTN; i++) {
            System.out.print(TN[i]);
            if (i < cTN - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}