package oop.inheritance4;

public class Test {

    public static void main(String[] args) {

        Book book = new Book(200, "Java", "Coding");

        System.out.println(book.pageCount);

        System.out.println(book.getPageCount());

        NoteBook noteBook = new NoteBook();

        System.out.println(noteBook.pageCount);

        System.out.println(noteBook.getPageCount());

        /*
        200
            200
            0
            500
         */
        book.pageCount = 404;
        System.out.println(noteBook.pageCount);
        System.out.println(book.pageCount);

        book.read();
        noteBook.read();
        Book.read();
        NoteBook.read();
        System.out.println("===========");
        Book.read();
        NoteBook.read();
    }
}
