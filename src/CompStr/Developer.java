package CompStr;

public class Developer extends Employee {
    double salary = 150000;
    public Developer (String name, String surname, int age) {
        super(name, surname, age);
    }
    public double calculateBonus() {
        return salary * 1.25;
    }
    public String toString() {
        return "Developer " + name + " " + surname + " " + age + " " + salary;
    }
}
