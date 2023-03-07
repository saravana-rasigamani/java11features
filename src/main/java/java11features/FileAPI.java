package java11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAPI {
	
	public static void main(String[] args) throws IOException {
		
		Path filePath = Paths.get("C:/Users/kumar/Learning/test.txt");
		Files.writeString(filePath, "Welcome you all!!");
		
		String data = Files.readString(filePath);
		
		System.out.println(data);
	}

}
