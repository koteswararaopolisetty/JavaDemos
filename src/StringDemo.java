import java.util.Scanner;


public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = s1;
		String s4 = new String("Hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		/*When you are using == comparison
		1.Primitive types - it compares values
		2.If we are comparing string contents we should not use == use "equals"
		*/
		Scanner sc = new Scanner(System.in);
		s1 = sc.next();
		s2 = sc.next();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s[] = new String[2];
		System.out.println(s.length);
		s[0] = "CapGemini";
		System.out.println(s[0].length());
		s1="capgemini";
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.indexOf('i',7));
		System.out.println(s1.substring(3,6));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat(" Pvt Ltd"));
		System.out.println(s1.equalsIgnoreCase("CapGemini"));
		System.out.println(s1.charAt(4));
		
		System.out.println("**********Immutable*********");
		String ob1 = "Koti";
		String ob2 = ob1;//ob2 value is 'koti'
		System.out.println(ob1==ob2);
		ob1 = "Vnv";
		System.out.println(ob1==ob2);
		System.out.println(ob1.toUpperCase());//no reference for this output but it will all captial letters
		System.out.println(ob1);
		ob1 = ob1.toUpperCase();//Now the upper case string is referenced by ob1 (Vnv will be not referenced anymore means dangling value)
		
		//No Rule's no Policies, Yayyy!!! show all symbols as 7
		String input = sc.nextLine();
		String temp = input;
		//input = "No Rule's No Policies, Yayyy!!!";
		//System.out.println(str.length());
//		System.out.println(s1.indexOf("'",1));
//		System.out.println(s1.charAt(4));
	     for ( int i = 0; i < input.length(); i++ ) {
	         char c = input.charAt(i);
	         if(! ((c >= 65 && c <=90)||(c >=97 && c <=122)) )
	         {
	        	// temp = temp.substring(0,i);
	        	 //temp = temp.concat("7").concat(input.substring(i+1));
	        	 input = input.replace(c, '7');
	         }
	     }
	         System.out.println(input);
	         
	}
}
