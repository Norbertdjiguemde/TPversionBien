import java.util.Scanner;

public class Puissance {

	public static void main(String[] args) {
			int n;
			double x,p;
	Scanner sc=new Scanner(System.in);	
	System.out.println("Donner la valeur de x=");
	x=sc.nextInt();
	System.out.println("Donner la valeur de n=");
	n=sc.nextInt();
	p=Math.pow(x,n);
	System.out.print("Donner la puissance est P=" +p);
	}

}
