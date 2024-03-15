import java.util.Scanner;

public class TP126 {
    public static void main(String[] args) {
    	
        Scanner scr = new Scanner(System.in);

        System.out.print("Entrez le poids en kg = ");
        double poids = scr.nextDouble();
        System.out.print("Entrez la taille en m : ");
        double taille = scr.nextDouble();

        scr.nextLine(); 
        System.out.print("Entrez le sexe (h/f) = ");
        String sexe = scr.nextLine();

        double imc = calculerIMC(poids, taille);

        String EtatPoids = determinerEtatPoids(imc, sexe);

        // Affichage des résultats
        System.out.printf("L'IMC est : %.2f%n", imc);
        System.out.println("État de poids = " + EtatPoids);
    }

    public static double calculerIMC(double poids, double taille) {
        return poids / (taille * taille);
    }

    public static String determinerEtatPoids(double imc, String sexe) {
        if (sexe.equals("h")) {
            if (imc < 20) {
                return "Maigreur";
            } else if (imc <=25) {
                return "Poids normal";
            } else if (imc <=30) {
                return "Surcharge pondérale";
            } else if( imc <=40) {
                    return "Adiposité";
            }else {
                return "Obésité";
            }
        } else if (sexe.equals("f")) {
            if (imc < 19) {
                return "Maigreur";
            } else if ( imc <=24) {
                return "Poids normal";
            } else if (imc <=30) {
                return "Surcharge pondérale";
            } else if(imc <=40) {
                    return "Adiposité";
            }else{
                return "Obésité";
                }
            } 
            else {
            return "Sexe non reconnu";
        }
        
    }
     
    }
    


