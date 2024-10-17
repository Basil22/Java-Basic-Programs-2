package TenToTwenty;

import java.util.Scanner;

public class No11_FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of digits: ");
		int n = scan.nextInt();
		
		int first = 0;
		int second = 1;
		System.out.print(first + " ");
		System.out.print(second + " ");
		
		int sum=0;
		for(int i=2; i<n; i++) {
			sum = first + second;
			first = second;
			second=sum;
			System.out.print(second + " ");
		}
		
		scan.close();
	}

}
