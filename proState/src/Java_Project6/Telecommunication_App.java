package Java_Project6;

public class Telecommunication_App {

	public static void main(String[] args) {

		// Deskphone Object
		System.out.println("The desk phone system");
		DeskPhone myPhone = new DeskPhone("8484015599");
		
		myPhone.powerOn();
		myPhone.callPhone("8484015599");
		myPhone.answer();
		myPhone.dial("8484015599");
		
		System.out.println("------------------------------");
		
		// Mobilephone Object
		System.out.println("The mobile phone system");
		MobilePhone myPhone2 = new MobilePhone("9075772072");
		
		myPhone2.powerOn();
		myPhone2.callPhone("9075772072");
		myPhone2.answer();
		myPhone2.dial("9075772072");
		
	}

}
