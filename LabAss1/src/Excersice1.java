
public class Excersice1 {

	public static void main(String[] args) {
		int number=5;
		System.out.println(sumofcubes(number));
	}
	public static int sumofcubes(int number) {
		int sum=0;
		for(int i=1;i<=number;i++) {
			sum=i*i*i;
		}
		return sum;
	}
	

}
