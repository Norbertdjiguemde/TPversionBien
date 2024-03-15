import java.util.Scanner;
public class T121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N,i,S=0;
  Scanner s= new Scanner (System.in);
  System.out.print("Donner la valeur de N=");
  N=s.nextInt();
  if (N<0) { 
	  System.out.print("c'est un nombre entier négatif N="+N);
  }else{
  for(i=1; i<=N; i++) { 
      if(N % i == 0) { 
    	  System.out.println("la valeur de "+ i +" est un diviseur de  "+ N); 
  S=S+i;
  System.out.println("la somme des diviseur est S=" +S);}}
  } 
  s.close();
}
}