public class Excersice7 {

	public static void main(String[] args) {
		int num=12345678;
		boolean flag = false;
		System.out.println("Enter a number : ");
		int currentDigit = num % 10;
		num = num/10;
		while(num>0) {
			if(currentDigit <= num%10) {
				flag = true;
				break;
			}
			currentDigit = num%10;
			num = num/10;
		}
		if(flag){
			System.out.println("Digits are not in increasing order.");
		}
		else {
			System.out.println("Digits is in increasing order");
		}

	}

}
