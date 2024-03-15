import java.util.Scanner;
public class TP123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,S=0;
  Scanner s= new Scanner (System.in);
  System.out.print("Donner la valeur de n=");
  n=s.nextInt();
  if (n<0) { 
	  System.out.print("c'est un nombre entier négatif n="+n);
  }else{
  for(i=1; i<n; i++) { 
      if(n%i == 0) {  
    	  S=S+i;}}
  if (S==n) {
    	  System.out.println("c'est un nombre parfait  "+ n +"="+i); }
  else {
	  
	  System.out.println("ce n'est pas un nombre parfait");}
  } 

}}
