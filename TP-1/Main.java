package firstproject;
import java.util.Scanner;


public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
	  
		
		System.out.print("donner un int : ");
		int ligne = input.nextInt();
		
		System.out.print("donner un float");
		float FLT = input.nextFloat();
		
		System.out.print("donner un char: ");
		char CHARA = input.next().charAt(0);
		
		System.out.print("donner un bool: ");
		boolean BOOL = input.nextBoolean();
		
		
		boolean expression1 = (2>=4||0<6);
		System.out.println(expression1);
		
		boolean expression2 = (2>=4 && 0<6);
		System.out.print(expression2);
		
		
		
		
	}
	
}
