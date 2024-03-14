package Day8;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int temp = num;		
		int rev=0;
		
		while (num>0)
		{
			int d = num%10;
			rev = rev*10 + d;
			num = num/10;
					
		}
		
		if(temp==rev)
		{
			System.out.println(temp + " is palindrome");
		}
		else
		{
			System.out.println(temp + " not a palindrome");
		}

	}

}
