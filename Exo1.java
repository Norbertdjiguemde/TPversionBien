import java.util.Scanner;
public class Opérations {

	public static void main(String[] args) {
		double x,S,D,P;
		double Q,y;
Scanner sc = new Scanner (System.in);
System.out.print("Donner la valeur x=");
x=sc.nextDouble();
System.out.print("Donner la valeur y=");
y=sc.nextDouble();
S=x+y; D=x-y; P=x*y;
if (y!=0) {
Q=x/y;
System.out.println("le quotient des deux valeurs est Q=" +Q);
}else {
	System.out.println("erreur");}
	

	System.out.println("la valeur x est x=" +x);
	System.out.println("la valeur y est y=" +y);
	System.out.println("la somme des deux valeurs est S=" +S);
	System.out.println("la Différence des deux valeurs est D=" +D);
	System.out.println("le produit des deux valeurs est P=" +P);
	
		
sc.close();
	}}
