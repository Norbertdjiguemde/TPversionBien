import java.util.Scanner;

public class TP127 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Entrez le genre (h/f) : ");
        String sexe = scr.nextLine();

        System.out.print("Entrez l'âge : ");
        int age = scr.nextInt();
        boolean payementImpot = calculeImpot(sexe, age);
        if (payementImpot) {
            System.out.println("Vous devrez payer l'impôt.");
        } else {
            System.out.println("Vous êtes exclu au payement de l'impôt");
        }
    }

    private static boolean calculeImpot(String sexe, int age) {
        if (sexe.equals("h") && age > 20) {
            return true;
        } else if (sexe.equals("f") && age >= 18 && age <= 35) {
            return true;
        } else {
            return false;
        }
    }
}
