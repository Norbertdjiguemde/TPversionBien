import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
			int x, y,P;
	Scanner sc=new Scanner(System.in);	
	System.out.println("Donner la valeur de x=");
	x=sc.nextInt();
	System.out.println("Donner  y=");
	y=sc.nextInt();
	P=x;
	x=y;
	y=P;
	
System.out.println("la valeur permuté de x="+ x);
System.out.println("la valeur permuté de y="+ y);
sc.close();

	}

}
