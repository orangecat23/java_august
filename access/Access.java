package access;

interface Trainer {
    void train();
}

interface Developer {
    void develop();
}

class Employee implements Trainer, Developer {

    private String name = "Tanaya";
    int experience = 2;
    protected String role = "Java Developer";
    public String company = "ABC Technologies";

    @Override
    public void train() {
        System.out.println(name + " is training.");
    }

    @Override
    public void develop() {
        System.out.println(name + " is developing applications.");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience);
        System.out.println("Role: " + role);
        System.out.println("Company: " + company);
    }
}

public class Access {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.train();
        employee.develop();
        employee.display();

        System.out.println(employee.experience);
        System.out.println(employee.role);
        System.out.println(employee.company);

        // System.out.println(employee.name); // Error: private
    }
}