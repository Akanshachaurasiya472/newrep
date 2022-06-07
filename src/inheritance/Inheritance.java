package inheritance;
class Base{
	int x;
	
	public int getX() {
		return x;
	}

	
	public void setX(int x) {
		System.out.println("i m in base andsetting x now");
		this.x = x;
	}

	public void printme() {
		System.out.println("i m constructor");
	}
}
class derived extends Base{
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}	
public class Inheritance {

	public static void main(String[] args) {
		//creting an object of base class
		Base b=new Base();
		b.setX(4);
		System.out.println(b.getX());
		//creating an object of derived class
		derived d= new derived();
		d.setX(9);
		System.out.println(d.getX());
		

	}

}
