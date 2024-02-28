package CompStr;

public class Client {
    public static void main(String[] args) {
        Employee test1 = new Manager("Bogdan", "Shakaryan", 19);
        Employee test2 = new Salesperson("Bekzhan", "Rakhimbayev", 19);
        Employee test3 = new Developer("Alikhan", "Bekturganov", 19);
        System.out.println(test1.toString());
        System.out.println(test2.toString());
        System.out.println(test3.toString());
    }
}
