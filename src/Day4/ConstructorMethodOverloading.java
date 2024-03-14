package Day4;

public class ConstructorMethodOverloading {
	
	String name;
	ConstructorMethodOverloading() {
	System.out.println("Constructor method called.");
	}
	ConstructorMethodOverloading(String t) {
	name = t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorMethodOverloading cpp = new ConstructorMethodOverloading();
		cpp.setName("C++");
		cpp.getName();
		
		ConstructorMethodOverloading java = new ConstructorMethodOverloading("Java");		 
		java.getName();
	 
		}
		void setName(String t) {
		name = t;
		}
		void getName() {
		System.out.println("Language name: " + name);

	}

}
