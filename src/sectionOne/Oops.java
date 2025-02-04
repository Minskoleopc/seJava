package sectionOne;

public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Oops 
		// Class - effectively
		// Encapsulation
		//BankAccount acc = new BankAccount("123",1000);
		//System.out.println(acc.bal);
		//acc.getBal();
		
		// Inheritance
		
		//Student amol = new Student("chinmay","deshpande",23);
		//Teacher amol = new Teacher("chinmay","deshpande",23,1000);
		
		// Polymorphism 
		// overloading
		
//		Calculator cc = new Calculator();
//		cc.addition(12, 1);
//		cc.addition(12, 1,3);
//		cc.addition(12, 1,4,5);
		
		// overriding
//		SBI a = new SBI();
//		a.loan();
//		a.save();
				
//		Car audi = new Car();
//		Bike bmw = new Bike();
//		audi.Country();
//		audi.startEngine();
		
		SBI aa = new SBI();
		
		
		

	}

}

class SBI implements Bank{

	@Override
	public void save() {
		System.out.println("Save");
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan");
	}

	@Override
	public void ROI() {
		// TODO Auto-generated method stub
		System.out.println("ROI");
	}
	
}



interface Bank {
	
	public void save();
	public void loan();
	public void ROI();
	
	
}


// Abstraction 
//abstract class Vehicle {
//	abstract void startEngine();
//	public void Country(){
//		System.out.println("India");
//	}
//}
//class Car extends Vehicle{	
//	void startEngine() {
//		System.out.println("car engine");
//	}
//
//}
//class Bike extends Vehicle{
//	void startEngine() {
//		System.out.println("bike engine");
//	}
//	
//}
//

//// Polymorphism
// Overloading 

//class WorldBank {
//	
//	public void loan() {
//		System.out.println("Loan from WB");
//	}
//	public void save() {
//		System.out.println("Save from WB");
//	}
//	
//	
//}
//class SBI extends WorldBank{
//	// overriding
//	public void loan() {
//		System.out.println("Loan from SBI");
//	}
//	public void save() {
//		System.out.println("Save from SBI");
//	}
//	
//}



//class Calculator{
//	
//	public void addition(int x , int y) {
//		System.out.println(x+y);
//	}
//	
//	public void addition(int x , int y , int z) {
//		System.out.println(x+y+z);
//	}
//	
//	
//	public void addition(int x , int y , int z , int a ) {
//		System.out.println(x+y+z+a );
//	}
//	
//
//}
//








//
//class Student {
//	
//	String firstName;
//	String lastName ;
//	int age;
//		
//	public Student(String fn , String ln , int age) {
//		this.firstName = fn ;
//		this.lastName = ln ;
//		this.age = age;
//	}
//	
//	public  void displayName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//	
//}
//
//class Teacher extends Student{
//	
//	int salary;
//	public Teacher(String fn, String ln, int age, int salary) {
//		super(fn, ln, age);
//		this.salary = salary;
//		
//	}
//	public  void displaySalary() {
//		System.out.println(this.salary);
//	}
//	
//	
//}
//


//
//// Encapsulation
//class BankAccount {
//	
//	private String accNo;
//	private int bal ;
//	
//	// constructor
//	
//	public BankAccount(String accNo , int bl) {
//		this.bal = bl;
//		this.accNo = accNo;
//	}
//	
//	public void deposit(int amount) {
//		this.bal = this.bal + amount;
//	}
//	
//	public void withdrawl(int amount) {
//		if(this.bal > amount) {
//			this.bal = this.bal + amount;
//		}
//		else {
//			System.out.println("Insuffcient balance");
//		}
//			
//	}
//	
//	public int getBal() {
//		return this.bal;
//	}
//	
//	
//	
//
//}
//














// Encapsulation - data hiding 
// Abstraction  - implementation hiding
// Inheritance - re-ability
// Polymorphism -  multiple
// Interface -  complete abstraction
