import java.util.Scanner;
public class Equations {

	public static void main(String[] args) {
			int  b;
			double x,a;
	Scanner sc=new Scanner(System.in);	
	System.out.println("Donner la valeur de a=");
	a=sc.nextDouble();
	System.out.println("Donner la valeur de b=");
	b=sc.nextInt();
	if (a!=0) {
		x=-b/a;
		System.out.println(" la solution est x=" +x);
	} else { System.out.println("Erreur");}

	sc.close();
	}
}
