
public class Square {
	private double length;
	public double Area;
	public Square()
	{
		System.out.println("Box Constructor Called");
		length = 5;
	}
	public Square(double l)
	{
		length = l;
	}
//	public void setLen(double l)
//	{
//		length = l;
//	}
	
	public String calcArea()
	{
		 return "Area = "+ length*length;
	}
	public void setLength(double l)
	{
		length = l;
	}
	
	public void getLength(double l)
	{
		length = l;
	}
	@Override
	public String toString()
	{
		return "length"+length;
	}

}
