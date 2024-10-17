package TenToTwenty;

import java.util.ArrayList;
import java.util.List;

public class No14_NumberOfAlphabets {

	public static void main(String[] args) {
		String input = "Capgemini";
		int[] countArray = new int[26];
		
		for (char ch : input.toCharArray()) {
			ch = Character.toLowerCase(ch);
            countArray[ch - 'a']++;
        }
		
        List<String> outputList = new ArrayList<String>();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch) && countArray[Character.toLowerCase(ch) - 'a'] > 0) {
                outputList.add(ch + "-" + countArray[Character.toLowerCase(ch) - 'a']);
                countArray[Character.toLowerCase(ch) - 'a'] = 0;
            }
        }
        System.out.println(outputList);
	}
}
