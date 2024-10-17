package TenToTwenty;

import java.util.ArrayList;
import java.util.List;

public class No19_VowelFrequency {

	public static void main(String[] args) {
		String[] vowel = {"a", "e", "i", "o", "u"};
		int[] countArray = new int[5];
		
		String input = "capgemini training";
		String[] inputArray = input.split("");
		
		for(int i=0; i<inputArray.length; i++) {
			for(int j=0; j<vowel.length; j++) {
				if(inputArray[i].equals(vowel[j])) {
					countArray[j]++;
				}
			}
		}
		List<String> output = new ArrayList<String>();
		for(int i=0; i<vowel.length; i++) {
			if(countArray[i] > 0) {
				output.add(vowel[i] + "-" + countArray[i]);
			}
		}
		
		System.out.print(output);
	}

}
