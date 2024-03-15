import java.util.Scanner;
public class TP24 {
public static void main(String[] args){
int i,j,N;
Scanner sc = new Scanner (System.in);
System.out.print("Entrer un entier N=");
  N = sc.nextInt();
for(i=0; i<= N;i++){
for(j=0; j<= i;j++)
    System.out.print("*");
    System.out.print("\n");
}
}
}