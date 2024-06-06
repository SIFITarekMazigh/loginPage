package LoginPageMVC;

public class Main {

	public static void main(String[] args) {
		
		Model m = new Model() ;
		Controleur c = new Controleur(m) ;
		Vue v = new Vue(m,c) ;
		c.setVue(v);
	}

}
