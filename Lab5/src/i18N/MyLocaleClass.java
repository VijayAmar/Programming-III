package i18N;

import java.util.Locale;
import java.util.ResourceBundle;

public class MyLocaleClass {
	
	public static void main(String[] args) {
		
		//locale builder 
		Locale alocale = new Locale("en", "US");
		Locale blocale = new Locale("fr", "CA");
		Locale clocale = new Locale("fr", "FR");
		
		ResourceBundle bundle =  ResourceBundle.getBundle("i18N.MessageBundle", blocale);
	
		System.out.println(bundle.getString("greetings"));
		System.out.println( bundle.getString("farewell"));
		System.out.println( bundle.getString("inquiry"));
		



	}

}
