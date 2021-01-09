/**
 * Create a method that can accept an array of String objects and sort in alphabetical order. The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.
 * Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
 * @Author : Vegesna.Harshitha
 */
package Lab2.Exercise1;

public class App {
	
	
	public int getSecondSmallest(int[] arr)
	{
		System.out.print(arr.length);
		if(arr.length==0)
		{
			return 0;
		}
		else if(arr.length==1)
		{
			return arr[0];
		}
		else
		{
		int str=arr.length;
		int temp=0;
		for(int i=0;i<str;i++ )
		{
			for(int j=i+1;j<str;j++)
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return arr[1];
	}
	}
}