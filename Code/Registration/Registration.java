package Registration;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String username; //can not be empty
		String password; //at least 6 characters long and at least 1 number
		String password2; //at least 6 characters long and at least 1 number. Need to match with password value
		String email; //must match to email validation rules
		String phone; //must be at least 7 numbers long and contain only numbers
		
		System.out.println("Registreeru siin");
		System.out.println("Kasutjanimi: ");
		username = input.nextLine();
	    System.out.println("Parool: ");
	    password = input.nextLine();
	    System.out.println("Korda parooli");
	    password2 = input.nextLine();
	    System.out.println("Email");
	    email = input.nextLine();
	    System.out.println("Mobiiltelefoni Nr");
	    phone = input.nextLine();
	    
	    if(validationUsername(username) == false) {
	    	System.out.println("Kasutajanimi on sisestamata!");
	    }else if (validationPassword(password) == false) {
	    	System.out.println("Parool peab olema vähemalt 6 märki pikk ning sisaldama vähemalt 1 numbrit!");
	    }else if(validationTwoPasswords(password2, password) == false) {
	    	System.out.println("Parool ja parooli kinnitused on erinevad!");
	    }else if(validationEmail(email) == false) {
	    	System.out.println("E-maili aadress on vale!");
	    }else if(validationPhone(phone) == false) {
	    	System.out.println("Telefoninumber on vale!");
	    }else {
	    	System.out.println("Saatsime Teie kinnituse sisestatud e-posti aadressile!");
	    }
	}

	public static boolean validationUsername(String username) {
		// TODO Auto-generated method stub
		
		if (!username.equals(""))
			return true;
		else
			return false;
	}
	
	public static boolean validationPassword(String password) {
		// TODO Auto-generated method stub
		
	    if ((password != null && password.length() >= 6) && (password.matches(".*[a-z]+.*")) &&
	            (password.matches(".*[0-9]+.*")))
            return true;
        else
            return false;
	}
	
	public static boolean validationTwoPasswords(String password2, String password) {
		// TODO Auto-generated method stub
		
		if (password2.equals(password))
			return true;
		else
			return false;
	}

	public static boolean validationEmail(String email) {
		// TODO Auto-generated method stub
		
	    if ((email != null && 
	    		(email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"))))
            return true;
        else
            return false;
	}
	
	public static boolean validationPhone(String phone) {
		// TODO Auto-generated method stub
		//[0-9] - phone number can contain only numbers
		// .* - If the condition is a matching
		
		if ((phone != null && phone.length() >= 7 && phone.matches("[0-9]+")))
            return true;
        else
        	return false;
	}	

}