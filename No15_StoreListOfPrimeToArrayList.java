package TenToTwenty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No15_StoreListOfPrimeToArrayList {

	public static void main(String[] args) {
		List<Integer> primeArrayList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter upto Number: ");
		int n = scan.nextInt();
		
		if(n<=4) {
			for(int i=1; i<=n;i++) {
				if(i==2 || i==3 || i==5 || i==7) {
					primeArrayList.add(i);
				}
			}
		} else if(n>4){
				primeArrayList.add(2);
				primeArrayList.add(3);
				primeArrayList.add(5);
				primeArrayList.add(7);
				
				for(int i=2; i<=n; i++) {
					if(!(i%2==0 || i%3==0 || i%5==0 || i%7==0)) primeArrayList.add(i);
				}
		}
		System.out.println(primeArrayList);
		scan.close();
	}
}