package Chapter5;
// class member ada 2 perkara : 1.Property  2.Method
public class Person {
    String name;
    int age;
    String  gender;
    private String statusKahwin;
    
    //public interface
    public String getStatusKahwin(String jenisOrang){
        if (jenisOrang.equals("kanak-kanak")) {
            return "Muda lagi";
        } else if (jenisOrang.equals("dewasa")) {
            return "Berkahwin";
        } else {
            return "Bujang";
        }
        //return this.statusKahwin;
    }
    
    void walk() {
        
    }
    
    void talk() {
        
    }
    
    void sing() {
        
    }
}
