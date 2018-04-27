import java.util.Scanner;


//this represents template or blueprint or specification for box.java
public class TestBox {
		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Box b1 = new Box();//default
		
		System.out.println("Enter dimensions of box 2");
		System.out.println("Enter Length");
		int length = sc.nextInt();
		System.out.println("Enter Width");
		int width  = sc.nextInt();
		System.out.println("Enter Height");
		int height = sc.nextInt();
//		b1.setDetails(length,width,height);
		Box b2 = new Box(length,width,height);
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("Enter updated Length in box 2");
		length = sc.nextInt();
		b2.setLength(length);
//		String d1 = b1.display();
//		System.out.println(d1);
//		System.out.println(b2.display());
		
		//System.out.println(b1);
		System.out.println(b2);
	}
}
