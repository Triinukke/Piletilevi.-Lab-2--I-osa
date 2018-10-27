package Login;

public class Users {

	public String username;
	public String password;
	
	public String[][] accounts = {{"Triinu", "abcde6"},{"Berit", "12345f"},{"Sylvia", "Tere23"}};

	public Users(String usern, String passw){
	    username = usern;
	    password = passw;
	}
	
	public boolean auth() {
		// TODO Auto-generated method stub
		if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1]))
				||(username.equals(accounts[1][0])) && (password.equals(accounts[1][1]))
				||(username.equals(accounts[2][0])) && (password.equals(accounts[2][1]))) {
			return true;
		}
		else {
			return false;
		}
	}
}