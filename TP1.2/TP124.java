import java.util.Scanner;
public class TP124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,i,j,Somdivn=0,Somdivm=0;
  Scanner s= new Scanner (System.in);
  System.out.print("Donner la valeur de n=");
  n=s.nextInt();
  System.out.print("Donner la valeur de m=");
  m=s.nextInt();
  if (n<0||m<0) { 
	  System.out.print("un des deux nombre entier est négatif");
  }else{
  for(i=1; i<n; i++) { 
      if(n%i == 0)   
    	  Somdivn=Somdivn+i;}
  for(j=1;j<m;j++) { 
      if(m%j == 0)   
    	  Somdivm=Somdivm+j;}
  if (Somdivn==m && Somdivm==n) {
    	  System.out.println("c'est deux nombres sont des amis \n "+"Somdivn"+"="+"m"+"="+Somdivn+"\n"+"Somdivm"+"="+"n"+"="+Somdivm); }
  else {
	    System.out.println("ce n'est pas des nombres amis");}
  } 
s.close();
}}
