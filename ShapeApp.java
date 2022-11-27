interface IShape {
	String getName();
}

class Shape implements IShape {
	protected String name;

	public Shape() {
		this.name = "Shape";
	}

	public String getName() {

		return this.name;
	}
}

class Circle extends Shape {
	public Circle() {
		this.name = "Circle";
	}
}

class Quad extends Shape {
	public Quad() {
		this.name = "Quad";
	}
}

class Triangle extends Shape {
	public Triangle() {
		this.name = "Triangle";
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		this.name = "Rectangle";
	}
}

class Oval extends Shape {
	public Oval() {
		this.name = "Oval";
	}
}

class Rhombus extends Shape {
	public Rhombus() {
		this.name = "Rhombus";
	}
}

class ShapeNameWriter {
	private Shape shape;
	
	public ShapeNameWriter (Shape shape) {
		this.shape = shape;
	}

	public void writeShapeName() {
		System.out.println(this.shape.getName());
	}
}

public class ShapeApp {
	public static void main(String[] args) {
		new ShapeNameWriter(new Shape()).writeShapeName();
		new ShapeNameWriter(new Circle()).writeShapeName();
		new ShapeNameWriter(new Quad()).writeShapeName();
		new ShapeNameWriter(new Triangle()).writeShapeName();
		new ShapeNameWriter(new Rectangle()).writeShapeName();
		new ShapeNameWriter(new Oval()).writeShapeName();
		new ShapeNameWriter(new Rhombus()).writeShapeName();
	}
}
