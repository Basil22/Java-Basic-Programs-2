package TenToTwenty;

public class No13_DefaultMethodFunctionalInterface {

	public static void main(String[] args) {
		
		Override o = new Override();
		o.overrideThis();
		o.callThis();
	}

}

@FunctionalInterface
interface newInterface {
	void overrideThis();
	
	default void callThis() {
		System.out.println("Default method.");
	}
}

class Override implements newInterface{

	public void overrideThis() {
		System.out.println("Overriden method.");
	}
	
}
