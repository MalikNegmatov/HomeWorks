package HWObjects;

public class Author {
    String firstName;   // имя Автора
    String middleName; // отчество Автора
    String lastName;    // фамилия Автора

    // Конструктор по умолчанию.
    Author () {
    }
    /* Безусловная инициализация полей по умолчанию. При создании объекту всегда
      присваивается имя автора "Иван" + "Николаевич" + "Бездомный". */
    {
        firstName = "Иван";
        middleName = "Николаевич";
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

    /**
     * Метод склеивания в строку полного имени Автора
     * @return строка составленная из значений полей объекта разделенных пробелом.
     */
    public String fullName() {
        String name;
        name = this.firstName + " " + this.middleName + " " + this.lastName;
        return name;
    }

}
