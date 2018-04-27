
public class OverloadingDemo {
	public static void main(String[] args) {
	Overloading o1 = new Overloading();
	o1.add(2, 3);
	o1.add('2', '3');
}
	
}

class Overloading{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	//Over loading the add it depends on what the parameter has given
	//type , number , sequence of parameters will lead to method overloading
	public void add(char c1, char c2)
	{
		System.out.println(c1+""+c2);
	}
}