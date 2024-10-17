package TenToTwenty;

public class No11_FibonacciSeries {

	public static void main(String[] args) {
		
		int a = 0, b = 1, n = 6; //n -> number of digits 

		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int sum = a + b;
			a = b;
			b = sum;
		}
	}

}
