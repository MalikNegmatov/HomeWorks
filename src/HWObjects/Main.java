package HWObjects;

public class Main {

    public static Book testBook = new Book(), warAndPeace, theatricalNovel;

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

        System.out.println(testAuthor.toString());
        System.out.println(testAuthor);
        System.out.println(levTolstoyDouble);
        System.out.println();
        System.out.println(testAuthor.equals(levTolstoy));
        System.out.println(levTolstoy.equals(levTolstoyDouble));
        System.out.println();
        System.out.println(mikhailBulgakov.hashCode());
        System.out.println(bulgakovDouble.hashCode());
        System.out.println(levTolstoy.hashCode());
        System.out.println();

        System.out.println("Переопределяем для класса Book: ");

        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача №2");
    }

}
