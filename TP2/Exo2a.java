import java.util.Scanner;
public class TP22 {

	public static void main(String[] args) {
		{
			int N,X,I;
			double Resul; /* le produit des nombres entrés */
			 Scanner s= new Scanner (System.in);		  
do
{
	System.out.print("Donner le nombre de X =");
	  X=s.nextInt();
}
while (X<0);
do
{
	System.out.print("Donner l'exposant N =");
	  N=s.nextInt();
}
while (N<0);
/* Pour N=0, le résultat sera automatiquement X^0=1 */
for (Resul=1.0, I=1 ; I<=N ; I++)
Resul*=X;
if (N==0 && X==0)
System.out.print("le resultat non definie car X=0 et N=0");
else
System.out.println("Résultat est "+ Resul);
		}}}

