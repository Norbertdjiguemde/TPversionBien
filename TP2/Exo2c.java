
import java.util.Scanner;
public class TP21c {

	public static void main(String[] args) {
		{
			int N,NOMB, I; 
			long S; /* la somme des nombres entrés */
			double P; /* le produit des nombres entrés */
			 Scanner s= new Scanner (System.in);
			  System.out.print("Donner les nombre N =");
			  N=s.nextInt();
for (S=0, P=1, I=1 ; I<=N ; I++)
			  {
	System.out.println("le nombre de "+I);
    NOMB=s.nextInt();
	S=S+NOMB;
	P=P*NOMB;
			  }
		
			

			System.out.println("La somme de ces "+N+" nombres "+"S"+"="+S);
			System.out.println("Le produit  de ces"+N+" nombres "+"P"+"="+P);
			System.out.print("La moyenne de ces "+N+" nombres "+"Moy"+"="+ (float)S/N);
		
			
			
		}}}