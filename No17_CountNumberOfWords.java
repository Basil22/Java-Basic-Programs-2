package TenToTwenty;

public class No17_CountNumberOfWords {

	public static void main(String[] args) {
		String words = "Hello World";
		String[] numWords = words.split("[\\p{Punct}\\s]+");

		System.out.println(numWords.length + " words");

	}

}
