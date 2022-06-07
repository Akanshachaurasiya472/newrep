package constructor;
class Emplyoee{
	private int id;
	private String name;
	// constructor name is always same as class name 
	public Emplyoee() {
		 id=88;
		name="your name here ";
	}
	
	public String getName() {return name;}
		
	public void setName(String n) {	name=n;}
	
	public void setID(int i) { id=i;}

	public int getID() {return id;}
		
}

public class Constructor {

	public static void main(String[] args) {
		Emplyoee aka=new Emplyoee();
		System.out.println(aka.getID());
		

	}

}
