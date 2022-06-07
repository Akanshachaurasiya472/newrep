package Practice;
//poly -> many, morphism -> forms. when we do  one work in diffrent ways it called polymorphism  types ->1.overloding  or compiletime and 2.overridding or over ridding 
class Student1{
		 public String name;
		int age;
		public void printInfo(String name) {
			System.out.println(this.name);
		}
		public void printInfo(int age) {
			System.out.println(this.age);
			
		}
		public void printInfo(String name, int age) {
			System.out.println(this.name +" "+ this.age);
		}
	}
public class Polymorphism {
	public static void main (String args[]) {
	Student1 s1=new Student1();
	s1.name="akansha";
    s1.age= 24;
    s1.printInfo(s1.name,s1.age);
				

}
}


