import java.util.Scanner;

public class SeconEquat {

	public static void main(String[] args) {
			int  a,b,c;
			double x0,x1,x2,D,d;
	Scanner sc=new Scanner(System.in);	
	System.out.println("Donner la valeur de a=");
	a=sc.nextInt();
	System.out.println("Donner la valeur de b=");
	b=sc.nextInt();
	System.out.println("Donner la valeur de c=");
	c=sc.nextInt();
	D=b*b-(4*a*c);
	d=Math.sqrt(D);
	if (D>0) {
		System.out.println("le système d'équations admet deux solutions x1 etx2");
	x1=(-b-d)/(2*a);
	x2=(-b+d)/(2*a);
		System.out.println("la première solution est X1=" +x1);
		System.out.println("la deuxième solution est X2=" +x2);
	} else if(D==0) { 
		System.out.println("l'équations admet une solution double x0");
	     x0=-(b/(2*a));
	     System.out.println("la solution est X0=" +x0);
	  }else {
		  System.out.println("l'équations n'a pas de solution");
	  }

	sc.close();
	}
}
