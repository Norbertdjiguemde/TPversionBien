import java.util.Scanner;
public class TP23 {

	public static void main(String[] args) {
			int N,I;
			float S; /* Type float à cause de la précision du résultat. */
			 Scanner s= new Scanner (System.in);
do
{
	System.out.print("Donner les nombre N =");
	  N=s.nextInt();
}
while (N<1);
S=0.f;
for (I=1 ; I<=N ; I++)
S+=(float)1/I;
System.out.println("La somme des premiers termes de "+"N"+N+"est :\n"+"S"+"="+S);
}}