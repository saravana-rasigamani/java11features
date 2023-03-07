package java11features;

import java.util.Optional;

public class OptionalEmpty {
	public static void main(String[] args) {
		String name = null;
		
		System.out.println(Optional.ofNullable(name).isEmpty());
		System.out.println(Optional.ofNullable(name).isPresent());
	}

}
