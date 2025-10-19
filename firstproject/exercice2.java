package firstproject;
import java.util.Scanner;
import java.util.Random;


public class Main2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
	
		
		
		//qst 1d
		
		
	
		
		System.out.print("entrer la taille de vect n : ");
		
		int n = input.nextInt();
		
		int T[] = new int [n];
		int i,x;
		int sum = 0;
		
	for (i=0 ; i <= n-1 ; i++) {
		
		x = (i+1)*5;
		
	    sum = sum + x;
		
		T[i] = x;
		
		System.out.println("T["+i+"] =" + T[i]);
		
	}
	System.out.println("sum = " + sum);
		
	
	
	//qst 2
	
	System.out.print("entrer la taille de vect 2 n2 : ");
	int n2 = input.nextInt();
	int sum2 = 0;
	Random random = new Random();
		int T2[] = new int [n2];
		
		for (i=0 ; i<= n2-1 ; i++) {
			
			System.out.print("entrer la valeur de T2[" + i + "] : ");
	       int value = input.nextInt();
	       T2[i] = value;
			
	       sum2 += T2[i];
		}
		
		System.out.println("sum2 = " + sum2);
		
		
		
		//qst 3
		
		
		System.out.print("entrer la taille de vect 3 n3 : ");
		
		int n3 = input.nextInt();
		int sum3 = 0;
		int T3[] = new int [n3];
		
		for (i = 0 ; i <= n3-1 ; i++) {
			int randomVal = random.nextInt(100);
			T3[i] = randomVal;
			System.out.println("T3["+i+"] = " + T3[i]);
			sum3 =+ T3[i];
			
			
		}
		System.out.println("sum3 = " + sum3);
		
		
		
		
		
		
		
		
	}
	
}

