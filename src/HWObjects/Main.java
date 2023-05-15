package HWObjects;

public class Main {

    public static void main(String[] args) {
        // Задачи блока Объекты и классы
        task1();
        // Дополнительная задача блока Объекты и классы
        task2();
    }

    public static void task1() {
        System.out.println("Задача №1");

        Author testAuthor = new Author();
        Author levTolstoy = new Author("Лев", "Николаевич", "Толстой");
        Author mikhailBulgakov = new Author("Михаил Афанасьевич Булгаков");
        Author bulgakovDouble = new Author("Михаил", "Афанасьевич", "Булгаков");
        Author levTolstoyDouble = new Author("Лев Николаевич Толстой");

        System.out.println("Тест переопределения методов: toString, equals, hashCode, для класса Author: ");

        System.out.println(testAuthor);
        System.out.println(testAuthor);
        System.out.println(levTolstoyDouble + "\n");

        System.out.println(testAuthor.equals(levTolstoy));
        System.out.println(levTolstoy.equals(levTolstoyDouble) + "\n");

        System.out.println(mikhailBulgakov.hashCode());
        System.out.println(bulgakovDouble.hashCode());
        System.out.println(levTolstoy.hashCode() + "\n");


        System.out.println("Переопределяем для класса Book: \n");

        Book testBook = new Book();
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1867);
        Book theatricalNovel = new Book("Театральный роман", mikhailBulgakov, 1936);

        System.out.println(testBook);
        System.out.println(warAndPeace);
        System.out.println(theatricalNovel);
        System.out.println(warAndPeace.citeBook() + "\n"); // Вывод в разном формате.
        // Тестируем equals.
        System.out.println(theatricalNovel.equals(theatricalNovel));
        System.out.println(warAndPeace.equals(testBook) + "\n");
        // Тестируем hashCode.
        System.out.println(warAndPeace.hashCode());
        System.out.println(theatricalNovel.hashCode());
        theatricalNovel = warAndPeace;
        System.out.println(theatricalNovel.hashCode() + "\n");

    }

    public static void task2() {
        System.out.println("Задача №2 \n");

        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "", "King");
        Author stephenKing2 = new Author("Stephen", "", "King");
        Author levTolstoy = new Author("Lev", "", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");

        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(library);
    }
}
    /* По условию доп. задачи, код для класса main задан.
       Ожидаемый вывод кода в консоли должет быть следующим:

        Authors:
        Author copies equal: true
        Author copies equal by hashCode: true
        Authors equal: false
        Authors equal by hashCode: false
        Author: Stephen King
        Author: Lev Tolstoy
        ==============================
        Books:
        Book copies equal: true
        Book copies equal by hashCode: true
        Books equal: false
        Books equal by hashCode: false
        Book: The Stand by Author: Stephen King
        Book: War and Peace by Author: Lev Tolstoy
        ==============================
        Library:
        Book: The Stand by Author: Stephen King
        Book: War and Peace by Author: Lev Tolstoy
    */
