package Practice;

// class and object 
//object is an entity and blueprint is class 
//if we want to performe any pprogram in reallife we camn cretae it object and instruction of that object  like properties function is in the class which is blueprint
class Pen{
	String type; // properties
	String  color;
	
	public void write() { // creating a method
		System.out.println("writing something");
	}
	public void color() {
		System.out.println(this.color); //this is keyword "ye color function ko jo bhi object call kr rha hoga vo color print ho jyega  or this btyega kaun sa object call kr rha is function ko" 
	}
}
 // constructor is used to contruct a java object 
// class and constructor name is alwys same , it does not return any thing ,  one object  can call constructor only once   
class Student{
	String name;
	String age ;
	
	/*  1. non parameterized 
	Student(){
		System.out.println("constructor called");
	}
*/
	
	
/*	// 2. parameterized 
	Student( String name ,String age){
		this.name= name;
		this.age=age;
	}
	*/
	
	
	//copy constructor 
	Student(Student s2){
		this.name=s2.name; //it is copying the s2 info to its current object 
		this.age= s2.age;
	}
	
public void printInfo() {
	System.out.println((this.name));
	System.out.println(this.age);
}
Student(){
}
}
class Oops{
	public static void main(String args[]) {
		Pen pen1=new Pen(); // creating object 
		pen1.color="black";   //using the properties by using .
		pen1.type="gel";
		
		pen1.write(); //calling method
		pen1.color();
		
		Student s1=new Student();
		s1.name="akansha";
	    s1.age="24";
		
		Student s2=new Student(s1);// coping the s1 properties to s2 
		s1.printInfo();
	}
	
}