package MutiThreading;

class synFrist{
	
	// Synchronised Method
//	synchronized void meth(String msg){
	void meth(String msg){
		
		System.out.print("[ " + msg);
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(" ]");
		
	}
	
}

class MyThread implements Runnable{
	
	Thread t;
	synFrist f;
	String str;
	
	MyThread(synFrist z, String message){
		f = z;
		str = message;
		
		t = new Thread(this);
		t.start();
	}
	
	public void run(){
		// Synchronized Block
		synchronized(f){
			f.meth(str);
		}
	}
	
}

public class Synchronization {

	public static void main(String[] args) {
		
		synFrist sf = new synFrist();
		
		new MyThread(sf, "Omkar");
		new MyThread(sf, "Abhay");
		new MyThread(sf, "Ingawale");
		
	}

}