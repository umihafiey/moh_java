package Chapter4;

/**
 *
 * @author MOH
 */
public class Student {
   // pass variable by value VS by reference
   public void setName(String name) {
       System.out.println(name);
       name = name + "binti Md Yusoff";
   }
    
    void changeBookTitle(Book b) {
        b.title = "Java Advance";
    } 
    public static void main(String[] args) {
        Student s1 = new Student();
        String nama = "Hafidzah";
        //passing variable by value 
        //(ori value masih tak berubah)
        // primitive + String = passing by value
        // Object always passing by reference
        s1.setName(nama);
        System.out.println(nama);
        
        //passing variable by reference 
        //(ori value berubah berdasarkan reference)
        Book b1 = new Book();
        b1.title = "Java for beginner";
        System.out.println(b1.title);
        s1.changeBookTitle(b1);
        System.out.println(b1.title);
        
    }
    
}
