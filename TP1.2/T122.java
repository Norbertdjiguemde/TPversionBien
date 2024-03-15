import java.util.Scanner;
public class T122 {

	public static void main(String[] args) {
		int h,m;
  Scanner sc= new Scanner (System.in);
  System.out.print("Donner l'heure dont tu veux heure =");
  h=sc.nextInt();
  System.out.print("Donner les munites dont tu veux munites =");
  m=sc.nextInt();
  m=m+1;
  if (m==60) { 
	  m=0;
	  h=h+1; 
	}else if (h==24) {
		h=0;}
  System.out.println("Dans une munites il sera " + h + "h" + m+ "mn");}
}

