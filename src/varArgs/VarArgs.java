package varArgs;

public class VarArgs {
	static int sum(int ...arr) {
		// availabe  as int[ ]array
		 int sum=0;
		for(int a:arr) {
			sum=sum+a;
		}
		return sum;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum of 3 and 4="+sum( 3,4));
		System.out.println("sum of 3,5 and 4="+sum( 3,4,5));

	}

}
