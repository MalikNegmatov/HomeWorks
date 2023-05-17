package Сourse_base;

public class Employee {
    private String firstName;   // Имя
    private String middleName;  // Отчество
    private String lastName;    // Фамилия
    private int department;     // отдел
    private int salary;         // зарплата
    public static int id = 1;   // счетчик для присваивания объекту класса уникального id
    private final int idEmployee;     // id сотрудника

    /** методы get и set для всех полей класса */
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
        this.firstName = formatStr(firstName);
        this.middleName = formatStr(middleName);
        this.lastName = formatStr(lastName);
        this.department = department;
        this.salary = salary;
        this.idEmployee = id;
        id++;
    }

    public Employee() {
        java.util.Random random = new java.util.Random();
        this.firstName = fNames[random.nextInt(21)];
        this.middleName = mNames[random.nextInt(21)];
        this.lastName = lNames[random.nextInt(21)];
        this.department = random.nextInt(5);
        this.salary = random.nextInt(200000) + 40000;
        this.idEmployee = id;
        id++;
    }
    public String formatStr(String str) {
        str = checkInputErrors(str);
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    public String checkInputErrors(String str) {
        if (str != null && str.length() > 0) {
            str = str.replaceAll("[^\\а-яa-zA-zА-ЯЁё]", "");
        }
        return str;
    }
    @Override
    public String toString() {
        return "ID: " + this.idEmployee + "; ФИО: " + this.firstName + " " + this.middleName + " " + this.lastName
                + "; Отдел №" + this.department + "; ЗП:" + this.salary + ".";
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Employee employee = (Employee) other;

        if (department != employee.department) return false;
        if (salary != employee.salary) return false;
        if (idEmployee != employee.idEmployee) return false;
        if (!firstName.equals(employee.firstName)) return false;
        if (!middleName.equals(employee.middleName)) return false;
        return lastName.equals(employee.lastName);
    }
    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + middleName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + department;
        result = 31 * result + salary;
        result = 31 * result + idEmployee;
        return result;
    }

    private String[] fNames = new String[] {"Иван", "Сергей", "Борис", "Павел", "Геннадий", "Алексей", "Александр",
    "Виталий", "Олег", "Василий", "Петр", "Руслан", "Марат", "Владимир", "Дмитрий", "Радион", "Федор",
    "Семен", "Кирилл", "Андрей", "Феликс"};
    private String[] mNames = new String[] {"Иванович", "Сергеевич", "Борисович", "Павлович", "Геннадьевич",
            "Алексеевич", "Александрович", "Витальевич", "Олегович", "Васильевич", "Петрович", "Русланович",
            "Маратович", "Владимирович", "Дмитриевич", "Радионович", "Федорович", "Семенович", "Кириллович",
            "Андреевич", "Константинович"};
    private String[] lNames = new String[] {"Хорошилов", "Сергеев", "Борисов", "Павлов", "Семашко",
    "Васильев", "Родионов", "Прохоров", "Райкунов", "Малышев", "Точилин", "Сгибнев", "Фоминов",
    "Макаров", "Захаренко", "Шевченко", "Маслов", "Курбатов", "Шеин", "Рязанов", "Егоров"};
}
