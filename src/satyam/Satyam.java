package satyam;

import java.util.Scanner;

public class Satyam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter the age");  
		int age= sc.nextInt();  
		if(age<3){  
	        System.out.println("price of ticket is $22.00");  
	    }  
	    else if(age>=3 && age<=12){  
	        System.out.println("price of ticket is $13.00");  
	    }  
	    else if(age>=13 && age<=17){  
	        System.out.println("price of ticket is $16.00");  
	    }  
	    else if(age>=18 && age<=64){  
	        System.out.println("price of ticket is $16.00");  
	    }  
	   else{  
	        System.out.println("price of ticket is $0.00");  
	    }  

	}

}
