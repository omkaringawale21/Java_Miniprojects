package proState;

interface MyInter{
	void meth1();
	void meth2();
	void meth3();
	void meth4();
}

class myInterClass1 implements MyInter{
	@Override
	public void meth1(){
		System.out.println("This is Method 1 in Frist Class");
	}

	@Override
	public void meth2() {
		System.out.println("This is Method 2 in Frist Class");
	}

	@Override
	public void meth3() {
		System.out.println("This is Method 3 in Frist Class");
	}

	@Override
	public void meth4() {
		System.out.println("This is Method 4 in Frist Class");
	}
}

class myInterClass2 extends myInterClass1 implements MyInter{
	@Override
	public void meth1() {
		System.out.println("This is Method 1 in Second Class");
	}

	@Override
	public void meth2() {
		System.out.println("This is Method 2 in Second Class");
	}
	@Override
	public void meth3(){
		System.out.println("This is Method 3 in Second Class");
	}

	@Override
	public void meth4() {
		System.out.println("This is Method 4 in Second Class");
	}
}

class myClss extends myInterClass2 implements MyInter{
	 MyInter myMetho(){
		 return new myInterClass2();
//		 return new myInterClass1();
	 }
}

public class Interface_DMD {

	public static void main(String[] args) {
		
//		myInterClass1 mic1 = new myInterClass1();
//		myInterClass2 mic2 = new myInterClass2();
		
		MyInter mi;
		
		myClss my = new myClss();
		
		mi = my.myMetho();
		
		mi.meth1();
		mi.meth2();
		mi.meth3();
		mi.meth4();
		
	}

}
