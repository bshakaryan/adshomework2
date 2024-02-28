package CompStr;

public class Salesperson extends Employee {
    double salary = 70000;
    public Salesperson (String name, String surname, int age) {
        super(name, surname, age);
    }
    public double calculateBonus () {
        return salary = 1.25;
    }
    public String toString() {
        return "Salesperson " + name + " " + surname + " " + age + " " + salary;
    }
}
