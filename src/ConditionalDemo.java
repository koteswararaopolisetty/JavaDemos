import java.util.Scanner;


public class ConditionalDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 * WAP to take salary and name as input from the user
	 * Apply below conditions to calculate total pay
	 * sal < 10000 : no bonus
	 * sal >= 10000 and < 20000 : bonus 1000
	 * sal >= 40000 : bonus 5000
	 */
		double sal;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		sal = sc.nextDouble();
		System.out.println("Enter name");
		name = sc.next();
		if(sal < 10000)
			System.out.println(sal);
		else if(sal >=10000 & sal < 20000)
			System.out.println(sal+1000);
		else if(sal >=20000 & sal < 40000)
			System.out.println(sal+3000);
		else if(sal >=40000)
			System.out.println(sal+5000);
		
	
	/**
	 * WAP to take no as input from the user
	 * Ask users choice whether he wants to find if :
	 * 1. no. is odd or even
	 * 2. factorial of a no.
	 * 3. no is armstrong or not
	 * An armstrong number of three digits is an integer such
	 * that the sum of the cubes of its digits is equal to the number itself.
	 * For example, 371 is an armstrong number sice
	 * 3^3 + 7^3 + 1^3 = 371
	 * 
	 */
	int p = 0;
	System.out.println("Enter value to use switch case 1 or 2 or 3");
	p = sc.nextInt();
	switch(p){
	case 1:
	//Even Or Odd
	int n;
	System.out.println("Enter the number to check even or odd");
	n = sc.nextInt();
	if(n%2 == 0)
		System.out.println("Even number");
	else
		System.out.println("Odd number");
	break;
	
	case 2:
	//Factorial 
	 int i,fact=1;  
	  int number;
	  System.out.println("Enter the number to find factorial");
	  number = sc.nextInt();
	  for(i=1;i<=number;i++)
	  {    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	  break;
	  
	case 3:
	// Armstrong Number
	int no = 0, y;
	System.out.println("Enter the number to find number is armstrong or not");
	no = sc.nextInt();
	int temp = no;
	double sum = 0;
	while(temp != 0)
	{
		y = temp%10;
		sum = sum + Math.pow(y,3);
		temp = temp/10;
	}
	if(sum == no)
		System.out.println(no + "\tis armstrong number");
	else
		System.out.println(no + "\tis not armstrong number");
	
	break;	
	
	  default : System.out.println("default");
	  
	} 
	}
}
