package java11features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicate {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java"," ","Python","PHP");
		
		List<String> filteredList = list.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
		
		System.out.println(filteredList);
	}

}
