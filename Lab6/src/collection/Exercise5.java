/*
 * Create a method which accepts a hash map and return the values of the map in sorted order as a List.
 * Author : Vegesna.Harshitha
 */
package collection;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Exercise5 {
      
       public int getSecondSmallest(int[] arr){
              List<Integer> intList = new ArrayList<Integer>();
              for(int i: arr){
                     intList.add(i);
              }
              Collections.sort(intList);
              return intList.get(1);
       }
       public static void main(String[] args) {
              Exercise5 s = new Exercise5();
              Scanner sc=new Scanner(System.in);
              int n;
              n=sc.nextInt();
              int arr[]=new int[n];
              for(int i=0;i<n;i++)
              {
            	  arr[i]=sc.nextInt();
              }
            
              int i = s.getSecondSmallest(arr);
              System.out.println(i);
       }

}
