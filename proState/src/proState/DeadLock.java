package proState;

/*
 * Create deadlock between three threads first thread executes 1 to 10 and second thread executes 11 to 20 and third thread executes 21 to 30
 * To lock a Thread frist at 5 and second at 15 and third at 25
 * @Author Omkar Ingawale
 */

class logic1 implements Runnable{
	
	Thread t;
	Thread obj;
	
	logic1(String name){
		
		t = new Thread(this, name);
		t.start();
		
	}
	
	public void run(){
		for(int i = 1; i <= 10; i++){
			System.out.println(Thread.currentThread().getName() + " Hello Omkar Ingawale " + i);
			try {
				Thread.sleep(1000);
				if(i == 5) obj.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class logic2 implements Runnable{
	
	Thread t;
	Thread obj;
	
	logic2(String name, Thread obj){
		
		this.obj = obj;
		
		t = new Thread(this, name);
		t.start();
		
	}

	public void run(){
		for(int i = 11; i <= 20; i++){
			System.out.println(Thread.currentThread().getName() + " Hello Yogesh Gotkhinde " + i);
			try {
				Thread.sleep(1000);
				if(i == 15) obj.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class logic3 implements Runnable{
	
	Thread t;
	Thread obj;
	
	logic3(String name, Thread obj){
		
		this.obj = obj;
		
		t = new Thread(this, name);
		t.start();
		
	}
	
	public void run(){
		for(int i = 21; i <= 30; i++){
			System.out.println(Thread.currentThread().getName() + " Hello Omkar Ingawale " + i);
			try {
				Thread.sleep(1000);
				if(i == 25) obj.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class DeadLock {

	public static void main(String[] args) {
		
		/*
		 * Application Lanch for DeadLock
		 */
		
		logic1 m1 = new logic1("Frist");
		logic2 m2 = new logic2("Second", m1.t);
		logic3 m3 = new logic3("Third", m2.t);
		m1.obj = m3.t;
		
	
//		System.out.println(m1.t.isAlive());
//		System.out.println(m2.t.isAlive());
//		System.out.println(m3.t.isAlive());
		
	}

}
