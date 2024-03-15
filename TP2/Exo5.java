
 
import java.util.Scanner;

public class TP25 {

	public static void main(String[] args) {
			int i,n, F=1;	
	Scanner sc=new Scanner(System.in);	
	
	do {
		System.out.println("Donner la valeur de n=");
		n=sc.nextInt();}
	while (n<0);
	i=1;
	F=1;
	while (i<=n) {
	F*=i;
	i++;}
	
		for (F=1, i=1 ; i<=n ; i++)
			F*=i;
	
	System.out.println("la factorielle de "+n+" "+"est"+"  "+F);}
	
	}
	