interface IShape {
	String getName();
}

class Shape implements IShape {
	public String getName() {
		return "Shape";
	}
}

class Circle extends Shape {
	@Override
	public String getName() {
		return "Circle";
	}
}

class Quad extends Shape {
	@Override
	public String getName() {
		return "Quad";
	}
}

class Triangle extends Shape {
	@Override
	public String getName() {
		return "Triangle";
	}
}

class Rectangle extends Shape {
	@Override
	public String getName() {
		return "Rectangle";
	}
}

class Oval extends Shape {
	@Override
	public String getName() {
		return "Oval";
	}
}

class Rhomb extends Shape {
	@Override
	public String getName() {
		return "Rhomb";
	}
}

class Writer {
	private Shape shape;
	
	public Writer (Shape shape) {
		this.shape = shape;
	}
	
	public void writeShapeName() {
		System.out.println(this.shape.getName()); 
	}
}

public class ShapeApp {
	public static void main(String[] args) {
		new Writer(new Circle()).writeShapeName();
		new Writer(new Quad()).writeShapeName();
		new Writer(new Triangle()).writeShapeName();
		new Writer(new Rectangle()).writeShapeName();
		new Writer(new Oval()).writeShapeName();
		new Writer(new Rhomb()).writeShapeName();
	}
}
