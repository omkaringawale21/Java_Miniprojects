package MutiThreading;

/*
 * Problem Statement: Internal Communication Method2 by using Boolean
 * @Author Omkar Ingawale
 */

class communicate1{
	
	int i;
	boolean b1 = true;
	boolean b2 = false;
	boolean b3 = false;
	
	synchronized void put(int num){
		if(b2){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		if(b3){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		i = num;
		System.out.println("Put : " + i);
		notifyAll();
		b1 = false;
		b2 = true;
		b3 = false;
	}
	
	synchronized int get(){
		if(b1){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		if(b3){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		System.out.println("Get : " + i);
		notifyAll();
		b1 = false;
		b2 = false;
		b3 = true;
		return i;
		
	}
	
	synchronized int getSquare(){
		if(b1){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		if(b2){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		System.out.println("Get Square : " + i * i);
		notifyAll();
		b1 = true;
		b2 = false;
		b3 = false;
		return i;
	}
	
}

class Putter1 implements Runnable{
	
	Thread t;
	communicate1 c;
	
	Putter1(communicate1 z){
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

class Getter1 implements Runnable{
	
	Thread t;
	communicate1 c;
	
	Getter1(communicate1 z){
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

class Squared implements Runnable{
	
	Thread t;
	communicate1 c;
	
	Squared(communicate1 z){
		c = z;
		t = new Thread(this);
		t.start();
	}
	
	public void run(){
		while(c.i < 30){
			c.getSquare();
		}
	}
	
}

public class Internal_Communication1 {

	public static void main(String[] args) {
		
		communicate1 communi = new communicate1();
		
		new Putter1(communi);
		
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		new Getter1(communi);
		
		new Squared(communi);
		
	}

}
