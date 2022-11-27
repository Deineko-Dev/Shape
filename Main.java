abstract class Shape {
	private String name;
	abstract public String getName();
}

class Circle extends Shape {
	private String name = "Circle";
	
	public String getName() {
		return this.name;
	}
}

class Quad extends Shape {
	private String name = "Quad";
	
	public String getName() {
		return this.name;
	}
}

class Triangle extends Shape {
	private String name = "Triangle";
	
	public String getName() {
		return this.name;
	}
}

class Rectangle extends Shape {
	private String name = "Rectangle";
	
	public String getName() {
		return this.name;
	}
}

class Oval extends Shape {
	private String name = "Oval";
	
	public String getName() {
		return this.name;
	}
}

class Rhomb extends Shape {
	private String name = "Rhomb";
	
	public String getName() {
		return this.name;
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

public class Main {
	public static void main(String[] args) {
		new Writer(new Circle()).writeShapeName();
		new Writer(new Quad()).writeShapeName();
		new Writer(new Triangle()).writeShapeName();
		new Writer(new Rectangle()).writeShapeName();
		new Writer(new Oval()).writeShapeName();
		new Writer(new Rhomb()).writeShapeName();
	}
}
