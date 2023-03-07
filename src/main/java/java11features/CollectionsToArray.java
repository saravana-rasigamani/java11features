package java11features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsToArray {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,34,56,67);
		
		Integer[] intArray = list.toArray(Integer[] :: new); // new way to convert from list to Array
				
		Arrays.stream(intArray).forEach(System.out::println);
		
		
		List<Integer> list1 = Arrays.stream(intArray).collect(Collectors.toList());
		List<Integer> list2 = Arrays.asList(intArray);
		
		System.out.println(list1);
		System.out.println(list2);
	}

}
