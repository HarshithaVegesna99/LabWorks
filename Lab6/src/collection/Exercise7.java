/*
 * Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 * @author Vegesna.Harshitha
 */
package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise7 {
	public int[] getSorted(int[] arr){
		List<Integer> sorter= new ArrayList<Integer>();
		
		int reverse=0;
		
		int num;
		for(int i=0; i<arr.length; i++) {
			num=arr[i];
			while(num!=0) {
				reverse=reverse*10+num%10;
				num=num/10;
			}
			arr[i]=reverse;
			reverse=0;
		}
		
	
		for(int i:arr) {
			sorter.add(i);
		}
		Collections.sort(sorter);
		for(int i=0; i<sorter.size(); i++) {
			arr[i]=sorter.get(i);
		}
		return arr;
		
	}
	public static void main(String[] args) {
		Exercise7 l1=new Exercise7();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=s.nextInt();
		int[] ch = new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++) {
			ch[i]=s.nextInt();
		}
		
		ch=l1.getSorted(ch);
		for(int i:ch) {
			System.out.println(i);
		}
				
	}

}