package Java_Project4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Music {
	
	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		
		Album album = new Album("Album1", "Omkar Ingawale");
		
		album.addSong("Arebic Song", 4.5);
		album.addSong("Aur Bantai", 3.5);
		album.addSong("Govyachya Kinaryavar", 5.0);
		albums.add(album);
		
		album = new Album("Album2", "Emmiway Bantai");
		
		album.addSong("Rammullo Rammulla", 4.5);
		album.addSong("Jump kar", 3.5);
		album.addSong("Mumbaichya Kinaryavar", 4.5);
		albums.add(album);
		
		LinkedList<Song> playList_1 = new LinkedList<Song>();
	
		albums.get(0).addToPlayList("Arebic Song", playList_1);
		albums.get(0).addToPlayList("Aur Bantai", playList_1);
		albums.get(1).addToPlayList("Jump kar", playList_1);
		albums.get(1).addToPlayList("Mumbaichya Kinaryavar", playList_1);
		
		play(playList_1);
		
	}

	private static void play(LinkedList<Song> playList){
		
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		
		ListIterator<Song> listIterator = playList.listIterator();
		
		if(playList.size() == 0){
			System.out.println("This playlist has no song!");
		}else{
			System.out.println("Now Playing " + listIterator.next().toString());
			printMenu();
		}
		
		while(!quit){
			
			int action = sc.nextInt();
			sc.nextLine();
			
			switch(action){
			
			case 0:
				System.out.println("Playlist completed!");
				quit = true;
				break;
				
			case 1:
				if(!forward){
					if(listIterator.hasNext()){
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()){
					System.out.println("Now playing : " + listIterator.next().toString());
				}else{
					System.out.println("No song available!");
					forward = false;
				}
				break;
				
			case 2:
				if(forward){
					if(listIterator.hasPrevious()){
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()){
					System.out.println("Now playing : " + listIterator.previous().toString());
				}else{
					System.out.println("We are the frist song");
					forward = false;
				}
				break;
				
			case 3:
				if(forward){
					if(listIterator.hasPrevious()){
						System.out.println("Now playing : " + listIterator.previous().toString());
						forward = false;
					}else{
						System.out.println("We are at the start of the list!");
					}
				}else{
					if(listIterator.hasNext()){
						System.out.println("Now playing : " + listIterator.next().toString());
						forward = true;
					}else{
						System.out.println("We are reached to end of list!");
					}
				}
				break;
				
			case 4:
				printList(playList);
				
			case 5:
				printMenu();
				
			case 6:
				if(playList.size() > 0){
					listIterator.remove();
					if(listIterator.hasNext()){
						System.out.println("Now playing : " + listIterator.next().toString());
						forward = true;
					}else{
						if(listIterator.hasPrevious()){
							System.out.println("Now playing : " + listIterator.previous().toString());
						}
					}
				}
			
			
			}
			
		}
		
	}
	
	private static void printMenu(){
		
		System.out.println("Avalables options \n press");
		System.out.println("0 - to quit \n"
				         + "1 - to play next song \n"
				         + "2 - to play previous song \n"
				         + "3 - to play current song \n"
				         + "4 - list of all songs \n"
				         + "5 - print all available options \n"
				         + "6 - Delete current song"
				);
		
	}
	
	private static void printList(LinkedList<Song> playList){
		
		Iterator<Song> iterator = playList.iterator();
		System.out.println("-------------------------");
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("-------------------------");
	}
	
}
