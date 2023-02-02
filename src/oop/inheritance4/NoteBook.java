package oop.inheritance4;

public class NoteBook extends Book {
   // int pageCount;

    public NoteBook() {
        super(500, "Legends", "History");
    }

// static methods cannot be overridden
    public static void read(){
        System.out.println("Notebook Read");
    }

}
