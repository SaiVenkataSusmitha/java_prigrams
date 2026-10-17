abstract class Shape{
	abstract void area();
}
class Circle extends Shape{
	double radius;
	public Circle(double r){
		radius = r;
	}
	public void area(){
		double a = (22/7)*radius*radius;
		System.out.println("Area of circle: "+a);
	}
}
public class AbstractDemo{
	public static void main(String[] args){
		Shape s = new Circle(5.0);
		s.area();
	}
}