package Day4;

public class ThrowException {
	static void validate(int age){
		if(age<18)
		throw new ArithmeticException("not valid");
		else
		System.out.println("welcome to vote on Technolamror");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(18);
		System.out.println("rest of the code...");

	}

}
