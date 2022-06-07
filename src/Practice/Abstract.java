package Practice;
abstract class Animal {
	abstract void walk();
	Animal(){
		System.out.println("animal created ");
	}
	public void eat() {
		System.out.println("animal can eat");
	}
}
class Horse extends Animal{
	Horse(){
		System.out.println("created a horse");
	}
	public void walk() {
		System.out.println("walk on 4 legs");
		
	}
	
}
class Chicken extends Animal{
	Chicken(){
		System.out.println("created a chicken");
	}
	public void walk() {
		System.out.println("walk on  2 legs");
		
	}
	
}

public class Abstract {
	public static void main (String args[]) {
		Horse horse = new Horse();
	}
	

}
