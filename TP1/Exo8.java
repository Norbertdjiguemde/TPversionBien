import java.util.Scanner;
public class PGCD {
	   public static void main(String[] args) {
	        int n1,i, n2, pgcd = 0; 
	        Scanner sc=new Scanner(System.in);	
	    	System.out.println("Donner la valeur de n1=");
	    	n1=sc.nextInt();
	    	System.out.println("Donner la valeur de n2=");
	    	n2=sc.nextInt();
	        for(i=1; i<=n1 && i<=n2; i++) {
	            if(n1% i==0 && n2%i==0)
	                pgcd=i;
	        }
	        System.out.printf("PGCD de n1 et n2 est PGCD=" +pgcd);
	    }
	}
