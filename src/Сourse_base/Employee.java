package Сourse_base;

public class Employee {
    private String firstName;   // Имя
    private String middleName;  // Отчество
    private String lastName;    // Фамилия
    private int department;     // отдел
    private int salary;         // зарплата
    public static int id = 1;   // счетчик для присваивания объекту класса уникального id
    private int idEmployee;     // id сотрудника

    /** Блок реализации методов get и set для всех полей класса */
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public int getIdEmployee() {
        return idEmployee;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employee(String firstName, String middleName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.idEmployee = id;
        id++;
    }

}
