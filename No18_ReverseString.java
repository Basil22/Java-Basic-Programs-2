package TenToTwenty;

import java.util.Arrays;

public class No18_ReverseString {

	public static void main(String[] args) {
		String input = "Java Programs";

		// Method #1
		String[] inputArray = input.split(" ");

		String temp = "";
		for (int i = inputArray.length - 1; i >= 0; i--) {
			temp += inputArray[i];
			temp += " ";
		}
		System.out.println(temp);
		
		//Using Java 8
		String reversed = Arrays.asList(input.split(" ")).stream()
		.reduce("", (a,b) -> b + " " + a);
		
		System.out.println(reversed);
	}
}
