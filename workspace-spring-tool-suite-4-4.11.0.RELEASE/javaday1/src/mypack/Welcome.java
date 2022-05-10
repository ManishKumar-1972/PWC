package mypack;

public class Welcome {
	
	public static void main(String[] args) {
//		System.out.println("welcome to java " + args[0] + " " + args[1]);
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a+b;
		System.out.println("the addition is " + c);
	}

}
