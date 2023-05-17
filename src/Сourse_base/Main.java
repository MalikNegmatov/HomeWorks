package Сourse_base;

public class Main {
    public static Employee employeeList[] = new Employee[20];
    public static void main(String[] args) {

        employeeList[0] = new Employee("ИВ АН", "вАСИЛ ьЁвич", "Комис434cаржевский", 1, 30000);

        for (int i = 1; i < 5; i++){
            employeeList[i] = new Employee();
        }

        System.out.println(employeeList[0].formatStr(employeeList[0].getFirstName()));
        System.out.println(employeeList[0].getMiddleName());
        System.out.println(employeeList[0].getLastName());
        System.out.println(employeeList[0].getIdEmployee());

        System.out.printf("%-20s%-10s%-10s%n", "имя поля", "значение", "тип поля");
        System.out.printf("%10s", employeeList[0].getIdEmployee());
        System.out.printf("%10s", employeeList[0].getFirstName());
        System.out.println();


        System.out.printf("%-4s | %-20s | %-10s\n",employeeList[0].getIdEmployee(),
                employeeList[0].getFirstName(), employeeList[0].getSalary());


        for (int i = 0; i < 5; i++){
            System.out.println(employeeList[i]);
        }



    }
    public static void printList(int size){

    }
}
