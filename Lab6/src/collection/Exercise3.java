package collection;

import java.util.*;

public class Exercise3 {
 
  public static HashMap method(int[] array) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
    for (int n: array) {
      map.put( n, n*n);
    }
    return map;
  }
 
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n;
	  n=sc.nextInt();
	  int array[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	array[i]=sc.nextInt();
    }
	  HashMap<Integer, Integer> map = method(array);
 
    Iterator<Integer> it = map.keySet().iterator();
    while(it.hasNext()){
    Integer key = it.next();
      System.out.println(key + " : " + map.get(key));
    }
  }
}