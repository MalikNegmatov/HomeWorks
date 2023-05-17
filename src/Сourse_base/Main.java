package Сourse_base;

public class Main {
    public static Employee employeeList[] = new Employee[10];
    public static void main(String[] args) {
        employeeList[0] = new Employee("Иван", null, "Комисcаржевский", 1, 30000);
        System.out.println(employeeList[0].getFirstName());
        System.out.println(employeeList[0].getMiddleName());
        System.out.println(employeeList[0].getLastName());
        System.out.println(employeeList[0].getIdEmployee());

        String test = "godunov32 av";
        System.out.println(ch);
    }
}
