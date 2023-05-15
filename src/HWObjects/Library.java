package HWObjects;

public class Library {
    private final Book[] books;
    private final int sizeLibrary; // класс без сеттеров, используем передаваемый параметр
    private int currentIndex; // Индекс свободной ячейки массива

    Library(int sizeLibrary){
        this.sizeLibrary = sizeLibrary;
        this.books = new Book[sizeLibrary];
        this.currentIndex = 0;
    }

    /**
     * Метод добавления книги в библиотеку
     * @param book - добавляемая книга
     */
    public void addBook(Book book) {
        if (this.currentIndex < this.sizeLibrary) {
            this.books[this.currentIndex] = book;
            this.currentIndex++;
            System.out.println("Книга успешно добавлена в библиотеку.");
        } else {
            System.out.println("Библиотека уже заполнена.");
        }
    }

    /**
     * Метод замены книги в библиотеке в конкретной ячейке.
     * @param book - новая книга на замену.
     * @param index - индекс ячейки, куда будет положена книга.
     */
    public void replaceBook(Book book, int index) {
        String message = "Книга \"" + books[index].getTitle() + "\" заменена на книгу \"";

        this.books[index] = book;
        message += books[index].getTitle() ;

        System.out.println(message+"\".");
    }

    /**
     * Метод поиска по названию книги и замены года ее издания:
     * @param title - название искомой книги.
     * @param year - год замены.
     */
    public void replaceYear(String title, int year){
        int count = 0;
        for (int i = 0; i < this.sizeLibrary; i++) {
            if ( title.equals(this.books[i].getTitle()) ) {
                this.books[i].setYear(year);
                System.out.println("Год издания успешно изменен.");
                count++;
            }
        }
        if (count == 0 ) {
            System.out.println("Книга \"" + title + "\" в библиотеке не найдена.");
        }
    }
    public void printLibrary() {
        System.out.println("В текущей библиотеке " + this.currentIndex + " следующих книг:");
        for (int i = 0; i < this.currentIndex ; i++ ){
            System.out.println(this.books[i].citeBook());
        }
    }
}
