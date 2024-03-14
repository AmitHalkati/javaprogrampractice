package Day4;

public class FinallyinExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			long data[] = new long[1000000000];					 
			}
			catch (Exception e) {
			System.out.println(e);
			}
			finally {
			System.out.println("finally block will execute always.");
			}
	}

}
