package Day8;

public class CountofUpperLowerDigitsChar {

	public static void main(String[] args) {
		int lCaseCount = 0, uCaseCount = 0, numbersCount = 0,
				sCharCount = 0;

		String s = "Welcome To JAVA Class @ 12345";//count space as well
		for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (Character.isLowerCase(ch)) {
		lCaseCount++;
		} else if (Character.isUpperCase(ch)) {
		uCaseCount++;
		} else if (Character.isDigit(ch)) {
		numbersCount++;
		} else {
		sCharCount++;
		}
		}
		System.out.println("Upper Case Count: " + uCaseCount);
		System.out.println("Lower Case Count: " + lCaseCount);
		System.out.println("Numbers Count: " + numbersCount);
		System.out.println("Special Characters Count: " + sCharCount);

	}

}
