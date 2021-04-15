package training;
class Rect
{
	int width;
	int height;

	public int area()
	{
		return width*height;
	}
}

public class SomethingIsWrong {
	
	public static void main(String args[]) {
	
    Rect myRect = new Rect();
    myRect.width = 40;
    myRect.height = 50;
    System.out.println("myRect's area is " + myRect.area());


}
}