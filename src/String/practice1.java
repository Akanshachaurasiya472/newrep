package String;

public class practice1 {
	int convertintoint(String Str) {
		int num=Integer.parseInt(Str);
		int convert =num;
		return convert;
	}
	public int getMax(String str,char ch) {
		int k=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				k++;
			}
		}
		return k ;
		
		
	}

	public static void main(String[] args) {
		practice1 obj=new practice1();
		int c=obj.convertintoint("8877");
		System.out.println(c);
		int d= obj.getMax("akansha", 'a');
		System.out.println(d);
		

	}

}
