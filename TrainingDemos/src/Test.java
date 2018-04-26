import java.util.Scanner;


public class Test
{

	public static void main(String[] args)
	{
		System.out.println("hello"+7+7);//+ concatenation
		System.out.println("hello"+(7+7));
		System.out.println(7+7+"hello");// Addition and print hello
		
		//escape sequences
		System.out.println("Hello \t Koti");
		//She said,"Let's go for a movie"
		System.out.println("She said,\"Let's go for a movie\" ");
		
		int x,y;
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("x = "+x+"y = "+y);
		System.out.println("Enter name");
		String name =sc.next();
		System.out.println("Welcome "+name);
		
		
	}
}
