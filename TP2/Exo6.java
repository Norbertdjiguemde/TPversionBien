import java.util.Scanner;

public class TP26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Saisie de la valeur de N
        System.out.print("Donnez la valeur de N = ");
        int N = s.nextInt();

        System.out.println("Nombres premiers jusqu'à " + N + " sont :");
        for (int i = 1; i <= N; i++) {
            if (estNombrePremier(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean estNombrePremier(int nombre) {
        if (nombre <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }

        return true;
    }
}