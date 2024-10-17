package TenToTwenty;

import java.util.Arrays;
import java.util.Collections;

public class No12_Return2ndLargest {

	public static void main(String[] args) {
		
		int[] intArr = {2,3,5,6,1,0};		
		int[] temp = new int[intArr.length];
		
		for(int i=0; i<intArr.length-1; i++) { //removing duplicates
			if(intArr[i] != intArr[i+1]) {
				temp[i] = intArr[i];
			}
		}
		temp[intArr.length-1] = intArr[intArr.length-1];	
		
		Arrays.sort(temp); //Only drawback: Array has to be sorted.
		System.out.println("Second Largest: " + (temp[temp.length-2]));
		
		//USING JAVA 8
		
		System.out.println(Arrays.asList(2,3,5,6,1,0)
		.stream()
		.sorted(Collections.reverseOrder())
		.distinct()
		.skip(1)
		.findFirst()
		.get());
		
	}

}
