package HWObjects;

import java.util.Objects;

public class Book {
    private String title;   // Название книги
    private Author author = new Author(); // Автор книги
    private int year;  // Год издания книги

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
        return this.author.toString();
    }

    public int getYear(){
        return this.year;
    }

    public void setTitle(String title){
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
        return "\"" + this.title + ": " + this.author + ": " + this.year + "\";";
    }

    @Override // Переписали под требования вывода формата в доп.задаче.
    public String toString() {
        return "Book:" + this.title + ": " + this.author + ": ";

    }

//    @Override
//    public String toString() {
//        return "Книга {" +
//                " Название книги: \"" + title + '\"' +
//                ", " + author + ", год издания = " + year +
//                " }";
//    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Book book = (Book) other;
        return  year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

//    По рекомендациям он-лайн урока с наставником.
//    @Override
//    public int hashCode() {
//        int result = title != null ? title.hashCode() : 0;
//        result = 31 * result + (author != null ? author.hashCode() : 0);
//        result = 31 * result + year;
//        return result;
//    }

}