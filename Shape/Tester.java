package project8;

public class Tester {

	    public static void main(String[] args) {
	        Rectangle r = new Rectangle(89, 100);
	        System.out.println("Rectangle area: " + r.getArea());

	        Circle c = new Circle(8);
	        System.out.println("Circle area: " + c.getArea());

	        Triangle t = new Triangle(45,8);
	        System.out.println("Triangle area: " + t.getArea());
	    }
	}
