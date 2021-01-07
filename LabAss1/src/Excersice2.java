
public class Excersice2 {

	public static void main(String[] args) {
		System.out.println(trafficlight("red"));
	}
	public static String trafficlight(String str) {
		String str1=null;
		if(str.equals("red"))
		{
			str1="Stop";
		}
		else if(str.equals("yellow"))
		{
			str="go";
		}
		else if(str.equals("green"))
		{
			str="Go";
		}
		return str1;
	}

}
