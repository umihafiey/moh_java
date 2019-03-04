//shift + alt + f - auto arrange code
package Chapter4;
/*
thisutk det/get a property OR
cdll/run a method
i.e this.jumlah = 100;
*/
public class LoanCalculator extends Calculator { //extends = inherit
    int jumlah = 0; // variable (property)
    //final = value ini tidakboleh tukar
    final String tajuk = "LOAN CALCULATOR";
    
    /* public void info() {
        
    }
    ini tidak boleh dibuat sebab parent info() dah final
    */

    // ini override cetak() dalam parent
    @Override
    public void cetak() {
        //this.tajuk ="abc"; error, dah final tak boleh tukar
        System.out.println("cetak LoanCalculator");
    }
    
        
    // ctrl + space - auto suggestion
    // psvm tab - public static void main(String[] args)
    public static void main(String[] args) { 
        LoanCalculator cal = new LoanCalculator(); //copy line=> shift + ctrl + arrow down
        cal.cetak();
        LoanCalculator cal2 = new LoanCalculator(1);
    }
    
    // constructor - tiada returndan nama mesti sama dengan class
    // dalam 1 class boleh ada multiple constructor
    // autorun bila createnew object
    // guna utk initialize variable
    // mesti public
    public LoanCalculator() {
        //super();
        System.out.println("I'm in constructor");
    }
    
    // constructor
    public LoanCalculator(int amount) {
        this.jumlah = amount; //initialize value awalan
        System.out.println("I'm in constructor 2");
    }
    
    //mesti return int, void - no return
    private int calcLoanPayment(int amount, int numberOfMonths, String state) {
    
        // Your code goes here
        return 0;
    }
    
    private int calcLoanPayment(int amount) {
        return 0;
    }

}
