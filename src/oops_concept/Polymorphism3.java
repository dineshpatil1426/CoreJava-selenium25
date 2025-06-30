package oops_concept;

class Shape {
	public double calculateArea() {
		return 0;
	}
}

class Circle extends Shape {

	private double radius;

	public Circle(double radius) {

		this.radius = radius;

	}

	public double calculateArea() {

		return Math.PI * radius * radius;
	}

}

class Rectangle extends Shape {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double calculateArea() {

		return width * height;
	}
}

class Triangle extends Shape {

	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double calculateArea() {

		return 0.5 * base * height;
	}
}

public class Polymorphism3 {

	public static void main(String[] args) {
		
		Circle circle = new Circle(4);
		System.out.println("Area of Circle: "+circle.calculateArea());
		
		Rectangle rect= new Rectangle(12, 34);
		System.out.println("Area of Rectangle: "+rect.calculateArea());
		
		Triangle triangle= new Triangle(5, 9);
		System.out.println("Area of Triangle: "+triangle.calculateArea());
		
	}

}
