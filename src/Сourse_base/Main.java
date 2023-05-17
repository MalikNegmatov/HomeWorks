package Сourse_base;

public class Main {
    public static Employee employeeList[] = new Employee[20];
    public static void main(String[] args) {

        employeeList[0] = new Employee("ИВ АН", "вАСИЛ ьЁвич", "Комис434cаржевский", 1, 30000);

        for (int i = 1; i < 20; i++){
            employeeList[i] = new Employee();
        }

        System.out.println(employeeList[0].formatStr(employeeList[0].getFirstName()));
        System.out.println(employeeList[0].getMiddleName());
        System.out.println(employeeList[0].getLastName());
        System.out.println(employeeList[0].getIdEmployee());

        for (int i = 0; i < 20; i++){
            System.out.println(employeeList[i]);
        }

    }
}
