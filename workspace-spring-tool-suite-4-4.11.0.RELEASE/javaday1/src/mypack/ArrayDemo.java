package mypack;

public class ArrayDemo {
	
	static int[] loaddata() {
		return new int[] {10,20,30,40};			
	}
	
	public static void main(String[] args) {
		
//		int[] data = new int[10];
//		data[0] = 10;
//		data[1] = 20;
//		data[2] = 30;
		int arr[]= loaddata();
		
		
		
//		for(int i=0; i<data.length; i++)
		for(int mydata:arr)
		{
			System.out.println(mydata);
		}
	}

}
