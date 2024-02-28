package CompStr;

public abstract class Employee implements Payable {
    public String name;
    public String surname;
    public int age;
    public double salary;
    public Employee (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public abstract double calculateBonus();
    public String toString() {
        return name + " " + surname + " " + age;
    }
}


