package HWObjects;

public class Main {

    public static Book testBook = new Book(), warAndPeace, theatricalNovel;
    public static void main(String[] args) {
        // Задачи блока Объекты и классы
        task1();
        // Дополнительная задача блока Объекты и классы
        task2();
    }

    public static void printAuthor(String author) {
        System.out.println(author);
    }

    public static void printAuthor(Author author) {
        String fullName = author.getFirstName() + " " + author.getMiddleName() + " " + author.getLastName();
        System.out.println(fullName);
    }
    public static void testAuthor() {
        Author testAuthor = new Author();
        printAuthor(testAuthor);
        testAuthor.setFirstName("George");
        testAuthor.setMiddleName("Bernard");
        testAuthor.setLastName("Shaw");
        printAuthor(testAuthor.fullName());

        Author levTolstoy = new Author("Лев", "Николаевич", "Толстой");
        Author mikhailBulgakov = new Author("Михаил Афанасьевич Булгаков");
        printAuthor(levTolstoy.fullName());
        printAuthor(mikhailBulgakov);
    }

    public static void printBook(String book){
        System.out.println(book);
    }

    public static void printBook(Book book){
        String cite = "\"" + book.getTitle() + "\" // " + book.getAuthorName() + ", " + book.getYear() + " г.";
        System.out.println(cite);
    }
    public static void testBook() {
        printBook(testBook);
        testBook.setTile("Too True To Be Good");
        Author shaw = new Author("George Bernard Shaw");
        testBook.setAuthor(shaw);
        testBook.setYear(1931);
        printBook(testBook.citeBook());

        Author levTolstoy = new Author("Лев", "Николаевич", "Толстой");
        Author mikhailBulgakov = new Author("Михаил Афанасьевич Булгаков");

        warAndPeace = new Book("Война и мир", levTolstoy, 1867);
        printBook(warAndPeace.citeBook());
        Author whoIs = warAndPeace.getAuthor();
        printAuthor(whoIs);

        theatricalNovel = new Book("Театральный роман", mikhailBulgakov, 1936);
        printBook(theatricalNovel.citeBook());
        theatricalNovel.setYear(1967);
        printBook(theatricalNovel.citeBook());
    }

    public static void task1() {
        System.out.println("Задача №1");
        testAuthor();
        System.out.println();
        testBook();
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача №2");
        Library myLibrary = new Library(5);

        myLibrary.addBook(warAndPeace);
        myLibrary.addBook(testBook);
        myLibrary.addBook(theatricalNovel);
        Author author = new Author("Лев Николаевич Толстой");
        Book book = new Book("Анна Каренина", author, 1875);
        myLibrary.addBook(book);
        book = new Book("Воскресение", author, 1899);
        myLibrary.addBook(book);
        book = new Book("Декабристы", author, 1884);
        myLibrary.addBook(book);

        myLibrary.replaceBook(book,3);
        System.out.println();

        myLibrary.printLibrary();
        System.out.println();

        myLibrary.replaceYear(theatricalNovel.getTitle(),1936);
        System.out.println();
        myLibrary.printLibrary();
        System.out.println();

        myLibrary.replaceYear("Воскрес",1936);
    }
}
