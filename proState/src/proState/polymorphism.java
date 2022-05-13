package proState;

class Figure{
	double dim1, dim2;
	
//	Figure(){
//		System.out.println("These are the polymorphism constructor of Figure");
//	}
	
	Figure(double dim1){
		this.dim1 = dim1;
	}
	
	Figure(double dim1, double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	void area(){
		System.out.println("The area of figure has been calculated!");
	}

}

class Rectangle extends Figure{
	double width, length;
	
	Rectangle(double width, double length){
		super(width, length);
		this.width = width;
		this.length = length;
	}
	
	void area(){
		System.out.println("The area of Rectangle = " + width * length);
	}
	
}

class Triangle extends Figure{
	double base, height;
	
	Triangle(double base, double height){
		super(base, height);
		this.base = base;
		this.height = height;
	}
	
	void area(){
		System.out.println("The area of Triangle = " + 0.5 * base * height);
	}
	
}

class combinedArea{
	Figure myArea(){
//		return new Rectangle(10, 10);
		return new Triangle(5, 10);
	}
}

public class polymorphism {

	public static void main(String[] args) {
		
//		Figure rect = new Rectangle(10, 10);
//		Figure tri = new Triangle(5, 10);
		
		Figure f;
		
		combinedArea c = new combinedArea();
		f = c.myArea();
//		c.myArea(rect);
//		c.myArea(tri);
		f.area();
		
//		Rectangle rect = new Rectangle(10, 10);
//		System.out.println("The calculated area of Rectangle = " + rect.area());
		
//		Triangle tri = new Triangle(5, 10);
//		System.out.println("The calculated area of Triangle = " + tri.area());
		
		
	}

}
