import java.util.Scanner;


public class Lab1_4 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String name1[]={"Divya"};
			String name2[]={"Bharathi"};
			char chr[]={'F'};
			
			
			System.out.println("Person Details:\n");
			System.out.println("---------------\n");
			for(String c:name1)
				System.out.println("First Name:"+c);
			for(String d:name2)
				System.out.println("Last Name:"+d);
			for(char e:chr)
				System.out.println("Gender:"+e);	
		}
}
