package Chapter4;

/*
discuss on "static" keyword
- apply to variable and method
- shared
*/

public class Book {
    static int bil =0; //shared by all object and own by class
    String title;
   
    public static void cetak() {
        System.out.println("Jumlah buku " + Book.bil);
    }
    
    Book() {
        Book.bil = Book.bil + 1;
        System.out.println("Bil buku = " + Book.bil);
    }
    
    public static void main(String[] args) {
        Book b1 = new Book(); //object=> refer to class Book
        Book b2 = new Book(); //object
        Book.cetak();
    }
    
}
