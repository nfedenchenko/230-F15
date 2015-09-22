import java.util.ArrayList;


public class ShapeTester {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		// TODO each team should initialize 
		// a shape & add to shapes
//		Shape circle 	= new Circle(/* TODO parameters? */);
//		Shape triangle 	= new Triangle(/* TODO parameters? */);
//		Shape pentagon 	= new Pentagon(/* TODO parameters? */);
		Shape hexagon	= new Hexagon();
		shapes.add(hexagon);
		
		for (Shape shape : shapes) {
			String s = 	"------------------------------------- \n";
			s +=			"Side Length: " + shape.getSideLength()+"\n";
			s +=			"Num sides:   " + shape.getNumSides()+"\n";
			s += 	 	"Area: 		  " + shape.getArea()+"\n";
			s += 	 	"Perimeter: 	  " + shape.getPerimeter()+"\n";
			s +=			"Height:		  " + shape.getHeight()+"\n";
			s +=			"Width:		  " + shape.getWidth()+"\n";
			s +=			"Angle:		  " + shape.getInteriorAngle()+"\n";
			shape.setSideLength(5);
			s +=			"New Length:  " + shape.getSideLength()+"\n";
			s +=			"-------------------------------------";
			System.out.println(s);
		}
		
	}

}
