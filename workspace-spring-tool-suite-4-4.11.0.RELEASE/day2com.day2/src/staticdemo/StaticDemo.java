package staticdemo;

public class StaticDemo {
	private static int a=10;
	public static void show() {
		System.out.println("method called " + a);
	}
	static {
		System.out.println("inside static");
	}

}
