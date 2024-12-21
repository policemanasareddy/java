import java.util.Scanner;

public class PrimeNo {
  public static boolean isPrime(int n) {
	  int i;
	  for(i=2;i<n/2 && (n % i !=0);i++);
			  if((n/2)== i) return true;
			  else return false;	
			  }
  public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter num");
	  int n = sc.nextInt();
	  if(isPrime(n) == true)
		  System.out.println("prime");
	  else System.out.println("not prime");
	  
     }
  }
