package inheritance;
class Base1{
	Base1(){
		System.out.println("i m base class constructor");
	}
	Base1(int a){
		System.out.println("i m base  class overloaded with a value  constructor "+a);
	}
			
}
class derived1 extends Base1{
	derived1(){
		//super(0);
		System.out.println("i m derived class constructor");
	}
	derived1(int a ,int b){
		super(7);
		System.out.println("i m derived class overloaded with value of b as:"+b);
	}
}
public class Constructor_Inheritance {

	public static void main(String[] args) {
		//Base1 b= new Base1();
		//derived1 d= new derived1();
		derived1 d= new derived1(2,4);

		

	}

}
