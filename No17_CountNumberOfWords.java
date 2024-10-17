package TenToTwenty;

import java.util.Arrays;

public class No17_CountNumberOfWords {

	public static void main(String[] args) {
		String words = "Hello World";
		String[] numWords = words.split("[\\p{Punct}\\s]+");
		
		System.out.println(numWords.length + " words");
		System.out.println(Arrays.toString(numWords));
		
		StringBuilder sb = new StringBuilder("helo");
		sb.append("world");
		
		System.out.println(sb);
	}

}
