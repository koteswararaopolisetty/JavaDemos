

public class Box1 {

	//data member - instance member/variables
	private int length;
	private int width;
	private int height;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Box1(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Box1 [length=" + length + ", width=" + width + ", height="
				+ height + "]";
	}
	

	
}
