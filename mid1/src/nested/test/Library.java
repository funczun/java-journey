package nested.test;

public class Library {
    static final String ERROR_MESSAGE = "도서관 저장 공간이 부족합니다.";
    static final String SHOW_MESSAGE = "== 책 목록 출력 ==";
    int count;
    Book[] books;

    private static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(String title, String author) {
        if (count >= books.length) {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        books[count++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println(SHOW_MESSAGE);
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }
}
