package TenToTwenty;

import java.util.Arrays;
import java.util.Collections;

public class No12_Return2ndLargest {

	public static void main(String[] args) {

		int[] intArr = { 2, 3, 5, 6, 1, 0 };

		// Using Arrays.stream()
		System.out.println(
				Arrays.stream(intArr).boxed().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get());

		// USING Arrays.asList()
		System.out.println(Arrays.asList(2, 3, 5, 6, 1, 0).stream().sorted(Collections.reverseOrder()).distinct()
				.skip(1).findFirst().get());

	}

}
