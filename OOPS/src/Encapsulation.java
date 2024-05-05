public class Encapsulation {
    // Private attributes
    private String name;
    private int age;

    // Constructor
    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) { // Ensuring age is non-negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        // Creating a new Person object
    	Encapsulation person = new Encapsulation("John", 30);

        // Accessing attributes using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying attributes using setter methods
        person.setName("Alice");
        person.setAge(-25); // Trying to set negative age

        // Accessing attributes again to verify changes
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
