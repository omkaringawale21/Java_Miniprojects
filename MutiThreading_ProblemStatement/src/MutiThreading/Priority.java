package MutiThreading;

/*
 * Problem Statement : Two Thread have same Thread Logic and setPriority different priority.
 * @Author Omkar Ingawale
 */

    // Method-1
class UserPriority implements Runnable{
	
	Thread t;
	boolean b = true;
	long cnt = 0;
	int p;
	
	UserPriority(String name, int p){
		this.p = p;
		t = new Thread(this, name);
		t.setPriority(p);
		t.start();
	}
	
	public void run(){
		while(b){
			System.out.println(Thread.currentThread().getName()+ p + " : " + " Hello " + cnt);
			cnt++;
		}
	}
	
}

public class Priority {

	public static void main(String[] args) {
		
		// Method-1
		UserPriority up1 = new UserPriority("Omkar ", 7);
		UserPriority up2 = new UserPriority("Yogesh ", 4);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		up1.b = false;
		up2.b = false;
		
		System.out.println(up1.cnt);
		System.out.println(up2.cnt);
		
	}

}