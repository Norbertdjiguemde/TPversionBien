
import java.util.Scanner;

public class Factorielle {

	public static void main(String[] args) {
			int i,n, F=1;	
	Scanner sc=new Scanner(System.in);	
	System.out.println("Donner la valeur de n=");
	n=sc.nextInt();
	for (i=1; i<=n; i++) {
		F*=i;
	}
	System.out.println("Donner la valeur de F=" +F);
	sc.close();
	}}
	