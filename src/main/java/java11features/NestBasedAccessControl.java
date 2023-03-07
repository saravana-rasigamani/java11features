package java11features;

public class NestBasedAccessControl {
	
	private void display() {
		System.out.println("-- private method --");
	}
	
	class NestedMain {
		void message() {
			display();
		}
	}
	
	public static void main(String[] args) {
		NestBasedAccessControl.NestedMain n = new NestBasedAccessControl().new NestedMain();
		n.message();
	}
}
