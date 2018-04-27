import java.util.Scanner;


public class Box {

	//data member - instance member/variables
	private int length;
	private int width;
	private int height;
	
	//Member method  / Instance method
	//expicit default constructor
	public Box()
	{
		System.out.println("Box Constructor Called");
		length = 3;
		width  = 3;
		height = 3;
	}
	//constructor overloading
	//parameterized constructor
	public Box(int l, int w, int h)
	{
		System.out.println("params");
		length = l;
		width  = w;
		height = h;
	}
//	void setDetails(int l, int w, int h)
//	{
//		length = l;
//		width = w;
//		height = h;
//	}
	//String display()
//	{
//		return "Length "+length+" Width "+width+" Height"+ height;
//	}
	//Setters : mutators
	public void setLength(int l)
	{
		length = l;
	}
	public void setWidth(int w)
	{
		width = w;
	}
	public void setHeight(int h)
	{
		height = h;
	}
	//getters : accessors
	public void getLength(int l)
	{
		length = l;
	}
	public void getWidth(int w)
	{
		width = w;
	}
	public void getHeight(int h)
	{
		height = h;
	}
	
	public int calVolume() 
	{
		return length*width*height;
	}
	//using String method to get information
	@Override
	public String toString()
	{
		return "Length "+length+" Width "+width+" Height"+ height;
	}
	
	
}
