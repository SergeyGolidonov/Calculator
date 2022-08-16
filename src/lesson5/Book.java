package lesson5;

public class Book {

    Author author;
    public String nameOfBook;
    public int pages;
    public int dateOfIssue;
    public int howManyPagesRead;

    public Book(String nameOfBook, Author author, int pages, int dateOfIssue, int howManyPagesRead) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.pages = pages;
        this.dateOfIssue = dateOfIssue;
        this.howManyPagesRead = howManyPagesRead;
    }

    public boolean howManyPagesRead() {
        int result = this.pages - this.howManyPagesRead;
        return result > 0;
    }

    @Override
    public String toString() {
        return "Вы читаете: " + nameOfBook +
                ", написаную автором: " + author.toString() +
                ", в ней " + pages + " страниц" +
                ", она была написана в " + dateOfIssue +
                " году.";
    }
}