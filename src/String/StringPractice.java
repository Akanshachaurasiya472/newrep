package String;

public class StringPractice {

	public static void main(String[] args) {
		 // problem 1 convert into lower case 
		String name= "Lower Case";
		name= name.toLowerCase();
		System.out.println(name);
		// problem 2  replace space into underscore
		String text="change space by underscore";
		text=text.replace(" ", "_");
		System.out.println(text);
		// problem3 
		String letter="Dear <|name|>, thanks a lot";
		letter=letter.replace("<|name|>", "akansha");
		System.out.println(letter);
		//problem 4 to detect spaces 
		String space= "this is sting  of   spaces";
		System.out.println(space.indexOf("  "));
		System.out.println(space.indexOf("   "));
      // string constructor  String(byte[] byte_arr)
		byte[] b_arr = {71, 101, 101, 107, 115};
		String s_byte =new String(b_arr);
		System.out.println(s_byte);
	}

}
