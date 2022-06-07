
package customeClass;
class Emplyoee{
	private int id;
	private String name;
//	public void printdetails() {
//		System.out.println("my id is "+id);
//	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public void setID(int i) {
		 id=i;
	}
	public int getID() {
		return id;
	}
}
public class CustomeClass {
	
	public static void main(String[] args) {
		System.out.println("this is custome class");
		/*Emplyoee aka=new Emplyoee(); // inistating a new employee object
		Emplyoee jnvi=new Emplyoee();
		//setting the attribute 
		aka.id=1;
		aka.name="akansha";
		// printing the attribute 
		//System.out.println(aka.id);
		aka.printdetails();
		jnvi.id=2;
		jnvi.printdetails();
		*/
		Emplyoee aka=new Emplyoee(); 
		aka.setName("akansha");
		System.out.println(aka.getName());
		
		
	}
}
