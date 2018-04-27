import java.util.Scanner;


public class lab1_5 {
	public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	n = sc.nextInt();
	if(n>0)
		System.out.println(n+"is positive number");
	else if(n<0)
		System.out.println(n+"is negative number");
	else
		System.out.println("neither positive nor negative");
}
}
