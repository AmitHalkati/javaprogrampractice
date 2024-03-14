package Day8;

import java.util.Scanner;

public class PracticePgm {
 
		public static void main(String[] args) {
			  
			  int x,y;
			  System.out.println("Enter the Value of x and y");
			  
			  Scanner sc = new Scanner(System.in);
			  x=sc.nextInt();
			  y=sc.nextInt();
			  
			  System.out.println("Before Swap \nx = "+x+" \ny = "+y);
			  x=x+y;
			  y=x-y;
			  x=x-y;


			  System.out.println("After Swap \nx = "+x+" \ny = "+y);
			  
		}
}
