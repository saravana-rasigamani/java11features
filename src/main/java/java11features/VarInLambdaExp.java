package java11features;

interface Cal{
	int sum(int a,int b);
}

public class VarInLambdaExp {
	public static void main(String[] args) {
		Cal cal = (var a,var b) -> a+b;
		System.out.println(cal.sum(15, 13));
		
	}
}
