package training;
class Rectangle
{
	double length;
	double width;
	public void setRectangle(double l, double r)
	{
		this.length = l;
		this.width = r;
	}
	public double getArea()
	{
		return length*width;
	}
}
class Box extends Rectangle
{ double height;
	public void setBox(double l, double r, double h)
	{
		this.length = l;
		this.width = r;
		height = h;
	}
	public double getVolume()
	{
		return length*width*height;
	}
}
public class RectBox {
	
	public static void main(String[] args) {
		Box b = new Box();
		b.setRectangle(16, 5.5);
		System.out.println(b.getArea());
		b.setBox(16, 5.5, 10);
		System.out.println(b.getVolume());
	}
	

}
