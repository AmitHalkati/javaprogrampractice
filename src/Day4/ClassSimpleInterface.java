package Day4;

public class ClassSimpleInterface implements InterfaceTest {

	public static void main(String[] args) {
		ClassSimpleInterface obj = new ClassSimpleInterface();
		obj.display();
		}
		// Defining method declared in interface
		public void display() {
		System.out.println(language + " is awesome");
}
	}
