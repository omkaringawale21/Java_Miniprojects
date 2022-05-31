package proState;

abstract class Fri{
	abstract void meth();
}

class Snd extends Fri{
	void meth(){
		System.out.println("Meth defined in Second class");
	}
}

class Thrd extends Fri{
	void meth(){
		System.out.println("Meth defined in Third class");;
	}
}

class myClass{
	// Frist Fri method return the thire object address
	Fri myMeth(){
//		return new Snd();
		return new Thrd();
	}
}

public class Abstract_DMD {

	public static void main(String[] args) {
//		Fri f = new Snd();
//		System.out.println(f.meth());
//		
//		Fri f1 = new Thrd();
//		System.out.println(f1.meth());
		myClass m = new myClass();
		
		Fri f;
		f = m.myMeth();
		f.meth();
	}

}