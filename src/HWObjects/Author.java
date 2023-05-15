package HWObjects;

import java.util.Objects;

public class Author {
    private String firstName;   // имя Автора
    private String middleName; // отчество Автора
    private String lastName;    // фамилия Автора

    // Конструктор по умолчанию.
    Author () {
    }
    /* Безусловная инициализация полей по умолчанию. При создании объекту всегда
      присваивается имя автора "Иван" + "Николаевич" + "Бездомный". */
    {
        firstName = "Иван";
//        middleName = "Николаевич";
        lastName = "Бездомный";
    }

    /**
     * Конструктор класса
     * @param firstName - имя Автора
     * @param middleName - отчество Автора
     * @param lastName - фамилия Автора
     */
    Author(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * Конструктор класса
     * @param fullName - полное имя Автора в формате ФИО с разделяющими их пробелами.
     */
    Author(String fullName){
        String[] names = fullName.split(" ");
        this.firstName = names[0];
        this.middleName = names[1];
        this.lastName = names[2];
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

//    /**
//     * Метод склеивания в строку полного имени Автора
//     * @return строка составленная из значений полей объекта разделенных пробелом.
//     */
//    public String fullName() {
//        String name = "";
//        if (this.firstName != null){
//            name += this.firstName + " ";
//        }
//        if (this.middleName != null){
//            name += this.middleName + " ";
//        }
//        return name + this.lastName;
//    }

    @Override
    public String toString() {
        String name="";
        if ( this.firstName != "" ) {
            name += this.firstName + " ";
        }
        if ( this.middleName != "" ) {
            name += this.middleName + " ";
        }
        if ( this.lastName != null ) {
            name += this.lastName;
        }
        return name;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true; // ну   левой объект x = x
        if (other == null || getClass() != other.getClass()) return false;

        Author author = (Author) other;
        return Objects.equals(firstName, author.firstName) &&
                Objects.equals(middleName, author.middleName) &&
                Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
        /*
            Прочитал про способ описанный кодом ниже, в том числе и рекомендации наставника
            группы на онлайн-уроке. Честно говоря, так и не убедили меня не пользоваться
            стандартным методом предоставляемым с Java7+ для переопределения hashCode.
            Как я понял, все необходимые проверки значений полей объекта, подаваемые
            методу Objects.hash(a1,a2,...,aN) учтены.

            int result = getFirstName() != null ? getFirstName().hashCode() : 0;
            result = 31 * result + (getMiddleName() != null ? getMiddleName().hashCode() : 0);
             и т.д...
         */
    }
}
