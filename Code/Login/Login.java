package Login;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String username;
		String password;
		String notRobot;
		
		System.out.println("Sisse logimine");
		System.out.println("Kasutjanimi: ");
		username = input.nextLine();
	    System.out.println("Parool: ");
	    password = input.nextLine();
	    System.out.println("Ma ei ole robot");
	    notRobot = input.nextLine();
	    
	    Users check = new Users(username, password);

	    if(controlIfNotRobot(notRobot)==false) {
	    	System.out.println("Palun kinnita, et Sa ei ole Robot");
	    }else if(check.auth()) {
	    	System.out.println("Oled sisse logitud Piletilevi süsteemi!");
	    }    
	    else {
	    	System.out.println("Kasutajanimi või parool ei ole korrektne.");
	    }	    
	}

	public static boolean controlIfNotRobot(String notRobot) {
		// TODO Auto-generated method stub
		
		if (notRobot.equals("Jah"))
			return true;
		else
			return false;
	}
}
