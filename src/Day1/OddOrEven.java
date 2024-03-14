package Day1;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("Enter an integer to check if it is odd or even ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		if ( x % 2 == 0 )
		System.out.println("You entered an even number is " +x);
		else
		System.out.println("You entered an odd number is " +x);
	}

}
