import java.util.Scanner;


public class ArrayDemo {

	public static void main(String[] args) {
		//declaration
		int arr[];
		//int []arr;
		//creation
		arr = new int[5];
		//declaration and creation in same line
		int arr1[] = new int[5];
		//initialization
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		//declare,creation and initialization
			int arr2[]={1,2,3,4,5};
			System.out.println(arr2.length);
		
		//For - each (enhanced for loop)
		System.out.println("**********FOR EACH***********");
		for(int a:arr)
			System.out.println(a*a);
		
		System.out.println("**********char array**********");
		char ch[]={'k','o','t','i'};
		for(char c:ch)
		System.out.println(c);
		
		System.out.println("**********string array**********");
		String str[]={"koti","p"};
		for(String c:str)
		System.out.println(c);
	}
}
