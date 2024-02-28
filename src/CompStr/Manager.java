package CompStr;

public class Manager extends Employee {
    double salary = 100000;
    public Manager(String name, String surname, int age) {
        super(name, surname, age);
    }
    public double calculateBonus() {
        return salary * 1.25;
    }
    public String toString() {
        return "Manager " + name + " " + surname + " " + age + " " + salary;
    }
}
