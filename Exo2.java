
import java.util.Scanner;
public class Cercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double R, S,P;
		final float pi=3.14f;
Scanner sc=new Scanner (System.in);
System.out.print("Donner le rayon =");
R=sc.nextDouble();
P=2*pi*R;
S=pi*R*R;
System.out.println("le périmetre du cercle est P=" +P + "\nla surface est S="+S);
sc.close();

	}}
