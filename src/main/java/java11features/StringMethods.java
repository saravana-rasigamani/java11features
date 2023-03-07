package java11features;

public class StringMethods {
	public static void main(String[] args) {
		String word = "  abcd efgh   ";
		
		System.out.println(word.repeat(3));
		System.out.println(word.isBlank());
		System.out.println("".isBlank());
		System.out.println("  ".isBlank());
		System.out.println("  ".isEmpty());
		System.out.println(word.strip());
		System.out.println(word.stripLeading());
		System.out.println(word.stripTrailing());
		System.out.println(word.stripIndent());
		
		word = "This\n is \n a multiline\n text";
		
		word.lines().forEach(System.out::println);
		
		
		
	}

}
