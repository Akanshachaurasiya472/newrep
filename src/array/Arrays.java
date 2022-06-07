package array;

public class Arrays {

	public static void main(String[] args) {
		//int []marks= new int[5];// declartion + allocation;
		int [] marks2= {12,2,3,4,7};
		int sum=0;
		// printing  sum of array
		for (int i=0;i<marks2.length;i++) {
			sum=sum+marks2[i];	
		}
		System.out.println(sum);
		System.out.println("in reverse order ");
		// reversing an array 
		
		for(int i=marks2.length-1;i>=0;i--) {
			System.out.print(marks2[i]+" ");
			System.out.println();
			
		}
		
		//for each loop
		System.out.println("using for use loop");
		for (int element: marks2) {
			System.out.println(element+" ");
		}
		// to find integer is present in a given array or not 
		System.out.println();
		int num=12;
		boolean isInArray=false;
		for(int element:marks2) {
			if(num==element) {
				isInArray=true;
				break;
			}	
		}
		if(isInArray) {
			System.out.println("the value is present in array");
		}else {
			System.out.println("not present");
		}

	}

}
