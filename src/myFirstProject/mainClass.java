package myFirstProject;

import java.util.Scanner;

public class mainClass {
	public static void main(String args[]) {
		System.out.println("hello java");
		System.out.println("enter the first number");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the third number");
		int c=sc.nextInt();
		System.out.println("enter the fourth number");
		int d=sc.nextInt();
		System.out.println("enter the fifth number");
		int e=sc.nextInt();
	
		
		System.out.println("the percentage of the student is: "+(a+b+c+d+e)/5*100);
		
	
		
		
	}

}
