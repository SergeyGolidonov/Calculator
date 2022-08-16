package lesson12FirstExercise;

public class Main {
    public static void main(String[] args) {

    Book firstBook = new Book("Война и мир");
    Book secondBook = new Book("Пираты карибского моря");
    Book thirdBook = new Book("Том и Джерри");
    Book fourthBook = new Book("Строительство для чайников");


    ReaderSupplier readerSupplier = new ReaderSupplier("Гурген");
    AdminOfLibrary adminOfLibrary = new AdminOfLibrary("Фома");
    Librarian librarian = new Librarian("Кузьмич");

    System.out.println();
    adminOfLibrary.orderBook(readerSupplier, secondBook);
    readerSupplier.giveBook(librarian, firstBook);
    librarian.orderBook(readerSupplier, thirdBook);
    adminOfLibrary.lateNotice(readerSupplier, thirdBook);
    adminOfLibrary.takeBook(readerSupplier, fourthBook);
    }
}