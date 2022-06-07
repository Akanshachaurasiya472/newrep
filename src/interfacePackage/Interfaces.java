package interfacePackage;

interface Bicycle{
	void applyBreak(int decrement);
	void speedup(int increment);
}
class AvonCycle implements Bicycle{

	@Override
	public void applyBreak(int decrement) {
		System.out.println("Applying break");
		
	}

	@Override
	public void speedup(int increment) {
		System.out.println("Applying speedup");
		
	}
	void blowHorn() {
		System.out.println("pppppppppppppppp");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		

	}

}
