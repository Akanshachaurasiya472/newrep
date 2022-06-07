// method  is like function  

//if we did the method static then we can call method without object creation otherwise we have to create object 
package methods;

public class Methods {
	
	int logic(int x,int y) {
		int sum=x+y; 
		return sum;
	}
	

	public static void main(String[] args) {
		Methods obj=new Methods();// creating object  method 
		 int c= obj.logic(2,8); // calling method by object 
		System.out.println(c);

	}
}
