package HWObjects;

public class Book {
    String title;   // Название книги
    Author author = new Author(); // Автор книги
    int year;  // Год издания книги

    // Конструктор по умолчанию.
    Book() {
    }
    /* Безусловная инициализация полей по умолчанию. При создании объект  всегда создает книгу
     по умолчанию: "Наша Марка" // Иван Николаевич Бездомный, 1935 г. */
    {
        title = "Наша Марка";
        year = 1935;
    }

    /**
     * Конструктор класса
     * @param title - название книги
     * @param author - автор книги
     * @param year - год издания
     */
    Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }
    public String getAuthorName() {
        return this.author.fullName();
    }

    public int getYear(){
        return this.year;
    }

    public void setTile(String title){
        this.title = title;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public void setYear (int year){
        this.year = year;
    }

    /**
     * Метод склеивания в строку полного титула книги для цитирования
     * @return строка составленная из значений полей объекта библиографической ссылки.
     */
    public String citeBook() {
        return "\"" + this.title + ": " + this.author.fullName() + ": " + this.year + "\";";
    }

}
