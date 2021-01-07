/**
 * Display String in reverse order word by word
 * @author Vegesna.Harshitha
 *
 */
public class Excersice5 {

	public static void main(String[] args) {
		int n = 10;
		int res = calculateSum(n);
		System.out.println("The sum of first N natural numbers divided by 3 or 5 is: "+res);
		

	}
	private static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i<=n; i++) {
			if(i%3==0 || i%5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
