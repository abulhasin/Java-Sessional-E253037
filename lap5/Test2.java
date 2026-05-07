class LibraryBook {
    String title;
    String author;
    int id;

    // Constructor
    LibraryBook(String t, String a, int i) {
        this.title = t;
        this.author = a;
        this.id = i;
    }

    // Show book info
    void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
    }
}

public class Test2 {
    public static void main(String[] args) {

        LibraryBook b1 = new LibraryBook("Java", "James", 1);
        LibraryBook b2 = new LibraryBook("C++", "Bjarne", 2);

        b1.show();
        System.out.println();
        b2.show();
    }
}