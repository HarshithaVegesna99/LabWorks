
public class Excersice3 {

	public static void main(String[] args) {
		int number=10;
		fibonacci(number);
	}
	public static void fibonacci(int n)
	{
		int a=1,b=1,c=0;
		System.out.println(a+" "+b+" ");
		for(int i=2;i<=n;i++) {
			c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}

}
