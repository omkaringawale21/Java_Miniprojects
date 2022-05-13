package MutiThreading;

/*
 * Problem Statement: Internal Communication Method1 by using Flag
 * @Author Omkar Ingawale
 */

class communicate{
	
	int i;
	int flag = 0;
	
	synchronized void put(int num){
		if(flag != 0){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		if(flag != 0){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		i = num;
		System.out.println("Put : " + i);
		notifyAll();
		flag = 1;
	}
	
	synchronized int get(){
		if(flag != 1){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		if(flag != 1){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		System.out.println("Get : " + i);
		notifyAll();
		flag = 2;
		return i;
	}
	
	synchronized int getSquare(){
		if(flag != 2){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		if(flag != 2){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
//		System.out.println("GetSquare : " + i);
		notifyAll();
		flag = 0;
		return i;
	}
	
}

class Putter implements Runnable{
	Thread t;
	communicate c;
	Putter(communicate z){
		c = z;
		t = new Thread(this);
		t.start();
	}
	public void run(){
		int k = 0;
		while(c.i < 30){
			c.put(++k);
		}
	}
}

class Getter implements Runnable{
	Thread t;
	communicate c;
	Getter(communicate z){
		c = z;
		t = new Thread(this);
		t.start();
	}
	public void run(){
		while(c.i < 30){
			c.get();
		}
	}
}

class GetSquare implements Runnable{
	Thread t;
	communicate c;
	GetSquare(communicate z){
		c = z;
		t = new Thread(this);
		t.start();
	}
	public void run(){
		while(c.i <= 30){
			int v = 0;
			v = c.i * c.i;
			System.out.println("Square of the get : " + v);
			c.getSquare();
		}
	}
}

public class Internal_Cammunication {

	public static void main(String[] args) {
		
		communicate cummu = new communicate();
		
		new Putter(cummu);
		
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		new Getter(cummu);
		
		new GetSquare(cummu);
		
	}

}