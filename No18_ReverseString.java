package TenToTwenty;

public class No18_ReverseString {

	public static void main(String[] args) {
		String input = "Capgemini Training";
		
		//Method #1
		String[] inputArray = input.split(" ");
		
		String temp = "";
		for(int i=inputArray.length-1; i>=0; i--) {
			temp += inputArray[i];
			temp+=" ";
		}
		System.out.println(temp);
		
		//Method #2
//		String[] inputArray = input.split("");
//		
//		String temp = "";
//		for(int i=inputArray.length-1; i>=0; i--) {
//			temp += inputArray[i];
//		}
//		System.out.println(temp);
	}
}
