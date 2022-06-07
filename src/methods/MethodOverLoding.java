package methods;

public class MethodOverLoding {
	static void telljoke() {
		System.out.println("i invented the new joke");
	}
	static void change(int x) {
		x=98;// copy of value is passed 
	}
	static void change2(int[] arr) {
		arr[0]=98;// copy of value is passed 
	}
	static void foo() {
		System.out.println("its method overloading ");
	}
	static void foo(int a) {
		System.out.println("its method overloding"+a);
	}

	public static void main(String[] args) {
		//telljoke();
		// case 1:-changing the array 
		int a=4;
		change(a);
		System.out.println(a); 
		
		// case2:- changing the value of array 
		int []marks= {12,33,44,55,88};
		change2(marks);
		System.out.println(marks[0]); // refrence is passing that's why value will chnge 
		
		//method overloading means when we create method with same name but diffrent parameters
		// you cant overload by changing the return type 
		foo();
		foo(10);

	}
	
	
	

}
