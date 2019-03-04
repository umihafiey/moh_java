//main() function berada di dalam 1 file khusus yang 
//akan menggunakan class-class yang lain

public class App {
	// static void main berperanan sbg entry point 
	//args as a default boleh tukar ke nama lain
	public static void main(String[] args) {
		//Create object
		Car ferrari = new Car();
		ferrari.numOfDoors = 2;
		ferrari.color = "red";  //mesti " " xboleh ' '
				  // ' ' utk char sahaja
		ferrari.print();
		Car porsche = new Car();
	}
}