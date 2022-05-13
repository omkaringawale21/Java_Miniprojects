package javaProject;

class shape{
	double dim1, dim2;
	
	shape(double d1){
		this.dim1 = d1;
	}
	
	shape(double d1, double d2){
		this.dim1 = d1;
		this.dim2 = d2;
	}
	
	void volume(){
		System.out.println("This are the volume constructor!");
	}
	
}

class cube extends shape{
	double side;
	
	cube(double side){
		super(side);
		this.side = side;
	}
	
	void volume(){
		System.out.println("Volume of Cube is = " + side * side * side);
	}
	
}

class sphere extends shape{
	double r;
	
	sphere(double r){
		super(r);
		this.r = r;
	}
	
	void volume(){
		System.out.println("Volume of Sphere is = " + (4.0f/3.0f) * Math.PI * r * r * r);
	}
	
}

class cylin extends shape{
	double r, h;
	
	cylin(double r, double h){
		super(r, h);
		this.r = r;
		this.h = h;
	}
	
	void volume(){
		System.out.println("Volume of Cylinder is = " + Math.PI * r * r * h);
	}
	
}

class cone extends shape{
	double r, h;
	
	cone(double r, double h){
		super(r, h);
		this.r = r;
		this.h = h;
	}
	
	void volume(){
		System.out.println("Volume of Cone is = " + (1.0f/3.0f) * Math.PI * r * r * h);
	}
	
}

class Volume{
	void myVolume(shape s){
		s.volume();
	}
}

public class polymorphism_inheritance {

	public static void main(String[] args) {
		
		cube cu = new cube(10);
		sphere sph = new sphere(10);
		cylin cy = new cylin(10, 30);
		cone co = new cone(10, 30);
		
		Volume v = new Volume();
		v.myVolume(cu);
		v.myVolume(sph);
		v.myVolume(cy);
		v.myVolume(co);

	}
	
}
