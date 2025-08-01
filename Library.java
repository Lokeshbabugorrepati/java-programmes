class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void show() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    Book[] books = new Book[3];

    void addBooks() {
        books[0] = new Book("Java", "James Gosling");
        books[1] = new Book("C++", "Bjarne Stroustrup");
        books[2] = new Book("Python", "Guido van Rossum");
    }

    void displayBooks() {
        for (Book b : books) {
            b.show();
        }
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.addBooks();
        l.displayBooks();
    }
}
