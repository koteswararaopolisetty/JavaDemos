import java.util.Scanner;


public class TestSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square s = new Square();
		//System.out.println("Enter length of square 1");
		//double length = sc.nextDouble();
		//s.setLen(length);
		System.out.println(s.calcArea());
		System.out.println("Enter length of square 2");
		double length = sc.nextDouble();
		Square s1 = new Square(length);
		//s1.setLen(length);
		System.out.println(s1.calcArea());
		
		System.out.println("Length of first square"+s);
		System.out.println("Length of Second square"+s1);
		
		System.out.println("Enter updated Length in square 2");
		length = sc.nextDouble();
		s1.setLength(length);
		System.out.println(s1.calcArea());
		System.out.println("Updated Length of Second square"+s1);
	}
}
