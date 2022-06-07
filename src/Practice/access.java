package Practice;
class Account{
	public String name; //can be used from anywhere
	protected String email ; // can be use from  Same classSubclass in the same package, Non-subclass in the same package,' Subclass in another package
	
	private String password ;
	// setter getter  to use the private  variable we use setter getter 
	public String getPassword() {
		return this.password;
	}
	public void setPassword( String pass) {
		this.password=pass;
	}
}
public class access {
	public static void main (String args[]) {
		Account account1= new Account();
		account1.name="apna college";
		account1.email="apnaclg@gmail.com";
		//account1.password="abcd"; // cant be use like this because of private variable
		account1.setPassword("abcd");
		System.out.println(account1.getPassword());
	}

}
