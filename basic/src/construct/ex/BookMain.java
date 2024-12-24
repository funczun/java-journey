package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.info();

        Book b2 = new Book("Hello Java", "Yoo");
        b2.info();

        Book b3 = new Book("JPA Programming", "Kim", 800);
        b3.info();
    }
}
