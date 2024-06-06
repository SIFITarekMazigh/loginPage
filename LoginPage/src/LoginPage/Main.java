package LoginPage;

public class Main {

	public static void main(String[] args) {
		IDandPassword idandPassword = new IDandPassword();
		
		
		new LoginPage(idandPassword.getLogininfo());
	}

}
