public class Employee extends Person {
    @Override
    String speak() {
        return "Hello world!";
    }

    @Override
    int age() {
        return 19;
    }

    public String jobTitle(String title) {
        return "I am a " + title;
    }

    public static void main(String[] args) {
        Employee bob = new Employee();
        System.out.println(bob.speak());
        System.out.println("I am " + bob.age() + " years old.");
        System.out.println(bob.jobTitle("Software Developer at Interaction Gaming"));
    }
}
