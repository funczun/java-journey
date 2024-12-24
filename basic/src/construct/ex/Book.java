package construct.ex;

public class Book {
    String title;
    String author;
    int pages;

    Book() {
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void info() {
        System.out.println("Title : " + title + "\nAuthor: " + author + "\nPages : " + pages);
        System.out.println("--------------------");
    }
}
