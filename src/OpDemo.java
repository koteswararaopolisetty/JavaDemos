
public class OpDemo 
{
	public static void main(String[] args)
	{
		//Logical operators & | [ && || --? short circuit operators]
			int a=25,b=30;
			//boolean b1 = (a<25) &&  ( (b=100) == 100);
			//System.out.println(b1);//false
			//System.out.println(b);//30
			boolean b1 = (a<25) &  ( (b=100) == 100);
			System.out.println(b1);//false
			System.out.println(b);//100
			
			//bitwise & |
			int m=3,n=7;
			System.out.println(m&n);//3
			System.out.println(m|n);//7
			System.out.println(m^n);//4
			
			System.out.println(args.length);
			System.out.println(args[0]);
	}
}
