package Selenium202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class xArraylistExerise {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>(Arrays.asList(1,1,3,4,6,7,7));
		System.out.println(removeDuplicateValues(list));
	}
public static List<Integer> removeDuplicateValues (List<Integer> nums){
		
	HashSet<Integer> unique = new HashSet <Integer>(nums);	 
	
	// List<Integer>uniqueVals = new ArrayList<Integer>(unique);
	
	List<Integer>uniqueVals = new ArrayList<Integer>();
	for(Integer un : unique) {
		uniqueVals.add(un);
	}
	//return new ArrayList<Integer>(new HashSet<Integer>(nums));  
	return uniqueVals;
 }
}
