package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Exercise6 {
	public List<Integer> votersList(Map<Integer, String> m1){
		List<Integer> sorter= new ArrayList<Integer>();
		LocalDate today = LocalDate.now();
		
		for(Map.Entry<Integer, String> entry: m1.entrySet()) {
			
			String[] date=entry.getValue().split("/");
			int dd=Integer.parseInt(date[0]);
			int mm=Integer.parseInt(date[1]);
			int yyyy=Integer.parseInt(date[2]);
			LocalDate dob = LocalDate.of(yyyy, mm, dd);
			Period diff= Period.between(dob,today);
			int age=diff.getYears();
			//System.out.println("The age is: " +age);
			if(age>18) {
				sorter.add(entry.getKey());
				//System.out.println("Key added: "+entry.getKey());
			}
		}
		
		return sorter;
		
	}
	public static void main(String[] args) {
		Exercise6 l1=new Exercise6();
		Scanner s=new Scanner(System.in);
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1711, "23/10/2020");
		m1.put(1712, "25/09/2010");
		m1.put(1713, "23/10/1998");
		m1.put(1714, "30/12/1995");
		m1.put(1715, "04/12/1992");
		
		List<Integer> id=l1.votersList(m1);	
		System.out.println("The voters list contains the following ids: ");
		for(Integer i: id) {
			System.out.println(i);
		}
	}

}