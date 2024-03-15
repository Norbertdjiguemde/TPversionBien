
import java.util.Scanner;
public class TP21do {

	public static void main(String[] args) {
		{
			int N,NOMB, I; 
			long S; /* la somme des nombres entrés */
			double P, Moy; /* le produit des nombres entrés */
			 Scanner s= new Scanner (System.in);
			  System.out.print("Donner les nombre N =");
			  N=s.nextInt();
	S=0; P=1; I=1;
			
		do {
			System.out.println("le nombre de "+I);
		    NOMB=s.nextInt();
			S=S+NOMB;
			P=P*NOMB;
			Moy=S/N;
			I++;} while(I<=N);
		
			

			System.out.println("La somme de ces "+N+" nombres "+"S"+"="+S);
			System.out.println("Le produit  de ces"+N+" nombres "+"P"+"="+P);
			System.out.print("La moyenne de ces "+N+" nombres "+"Moy"+"="+ (float)S/N);
		
			
			
		}}}