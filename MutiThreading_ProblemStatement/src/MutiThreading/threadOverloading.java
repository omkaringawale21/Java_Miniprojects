package MutiThreading;

//Problem-Statement: To create a Chid-Thread methods or class with different logics

    // Method 1: Extends Thraed
//class threadLogic extends Thread{
//	
//	public void run(){
//		for(int i = 1; i <= 5; i++){
//			System.out.println("Hello Omkar " + i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
//
//class threadLogic1 extends Thread{
//	
//	public void run(){
//		for(int i = 6; i <= 10; i++){
//			System.out.println("Hello Swapnil " + i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//}

     // Method 2 Implements Runnable

class MyThreadLogic1 implements Runnable{
	
	public void run(){
		for(int i = 1; i <= 10; i++){
			System.out.println("Hello Omkar Ingawale " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class MyThreadLogic2 implements Runnable{
	
	public void run(){
		for(int i = 11; i <= 20; i++){
			System.out.println("Hello Swapnil Chikane " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

//class MyThread{
//	
//	Thread t1;
//	Thread t2;
//	
//	MyThread(String name1, String name2){
//		
//		t1 = new Thread(new MyThreadLogic1(), name1);
//		
//		t2 = new Thread(new MyThreadLogic2(), name2);
//		
//		t1.start();
//		t2.start();
//		
//	}
//	
//}

public class threadOverloading {

	public static void main(String[] args) {
		
		// Method 1  Extends Thraed
//		threadLogic tl = new threadLogic();
//		tl.start();
//		threadLogic1 tl2 = new threadLogic1();
//		tl2.start();
		
	    // Method 2  Implements Runnable
//		new MyThread("Omkar Ingawale", "Swapnil Chikane");
		
		MyThreadLogic1 mt1 = new MyThreadLogic1();
		Thread t1 = new Thread(mt1);
		t1.start();
		
		MyThreadLogic2 mt2 = new MyThreadLogic2();
		Thread t2 = new Thread(mt2);
		t2.start();
		
	}

}