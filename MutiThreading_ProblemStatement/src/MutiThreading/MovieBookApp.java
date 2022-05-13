package MutiThreading;

import java.util.Scanner;

/*
 * Problem Statement: Synchronization in Movie Ticket Booking System
 * @Author Omkar Ingawale
 */

class BookTheaterSeat{
	
	static int total_seats = 100;
	
	// Synchronized Method
//	synchronized void bookSeat(int seats){
	
	// Static Synchronization
	synchronized static void bookSeat(int seats){
		
		// Synchronized Block
//		synchronized(this){
			if(total_seats >= seats){
				System.out.println(seats + " seats booked successfully!");
				total_seats = total_seats - seats;
				System.out.println("Toal Available Seats : " + total_seats);
			}else{
				System.out.println("Sorry seats cannot be booked..!!");
				System.out.println("Toal Available Seats : " + total_seats);
			}
//		}
			
	}
	
}

class MyThread1 extends Thread{
	
	static BookTheaterSeat b;
	int seats;
	
	MyThread1(BookTheaterSeat z,int seats){
		this.b = z;
		this.seats = seats;
	}
	
	public void run(){
		b.bookSeat(seats);
	}
	
}

class MyThread2 extends Thread{
	
	static BookTheaterSeat b;
	int seats;
	
	MyThread2(BookTheaterSeat z,int seats){
		this.b = z;
		this.seats = seats;
	}
	
	public void run(){
		b.bookSeat(seats);
	}
	
}

public class MovieBookApp extends Thread {
	
//	static BookTheaterSeat b;
//	int seats;
	
//	public void run(){
//		b.bookSeat(seats);
//	}
	
	public static void main(String[] args) {
		
		BookTheaterSeat b1 = new BookTheaterSeat();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a how much seats wants you : ");
		
		MyThread1 mt1 = new MyThread1(b1, sc.nextInt());
		mt1.start();
		
//		MovieBookApp omkar = new MovieBookApp();
//		omkar.seats = sc.nextInt();
//		omkar.start();
//		MovieBookApp yogesh = new MovieBookApp();
//		yogesh.seats = sc.nextInt();
//		yogesh.start()

		MyThread2 mt2 = new MyThread2(b1, sc.nextInt());
		mt2.start();
		MyThread1 mt3 = new MyThread1(b1, sc.nextInt());
		mt3.start();
		
		BookTheaterSeat b2 = new BookTheaterSeat();
		MyThread2 mt4 = new MyThread2(b2, sc.nextInt());
		mt4.start();
		MyThread2 mt5 = new MyThread2(b2, sc.nextInt());
		mt5.start();
		MyThread1 mt6 = new MyThread1(b2, sc.nextInt());
		mt6.start();
		
	}

}