package Day8;

public class ToString {
	private String name;
    private int age;

    // Constructor
    public ToString(String name, int age) {
        this.name = name;
        this.age = age;
    }
 // Override the toString() method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

	public static void main(String[] args) {
		// Create an object of ToStringExample class
        ToString person = new ToString("John", 30);

        // Print the object using toString() method
        System.out.println(person.toString());

	}

}
